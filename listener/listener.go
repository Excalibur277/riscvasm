package listener

import (
	"fmt"

	"github.com/antlr4-go/antlr/v4"
	"riscvasm.com/m/v2/listener/listenerstack"
	"riscvasm.com/m/v2/parsing"
)

var _ parsing.RISCVASMParserListener = &RISCVASMListener{}

type RISCVASMListener struct {
	parsing.BaseRISCVASMParserListener
	stack listenerstack.ListenerStack
	queue listenerstack.ListenerQueue
}

func Dequeue[T any](l *RISCVASMListener) T {
	d := l.queue.Dequeue()
	if dt, ok := d.(T); ok {
		return dt
	} else {
		panic(fmt.Sprintf("popping invalid type, got: %T, expected %T", d, new(T)))
	}
}

func Push[T any](l *RISCVASMListener, d T) {
	l.stack.Push(d)
}

func NewListener() *RISCVASMListener {
	return &RISCVASMListener{}
}

func (l *RISCVASMListener) Pop(amount int) {
	if len(l.queue) > 0 {
		panic(fmt.Sprintf("queue has %d values remaining", len(l.queue)))
	}
	l.queue = l.stack.Pop(amount)
}

func (l *RISCVASMListener) ExitEveryRule(c antlr.ParserRuleContext) {
	//fmt.Printf("Exiting Rule: %s\n\t%s\n", parsing.RISCVASMParserParserStaticData.RuleNames[c.GetRuleIndex()], c.GetText())
}
