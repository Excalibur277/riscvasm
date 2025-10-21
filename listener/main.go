package listener

import (
	"fmt"
	"runtime/debug"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"riscvasm.com/m/v2/instruction"
	"riscvasm.com/m/v2/parsing"
)

type syntaxError struct {
	line   int
	column int
	msg    string
}

func (err syntaxError) String() string {
	return fmt.Sprintf("line %d:%d %s", err.line, err.column, err.msg)
}

type syntaxErrors struct {
	errs []syntaxError
}

func (errs *syntaxErrors) add(line, column int, msg string) {
	errs.errs = append(errs.errs, syntaxError{line, column, msg})
}
func (errs *syntaxErrors) empty() bool { return len(errs.errs) == 0 }

func mapString[T fmt.Stringer](stringables []T) []string {
	stringslice := make([]string, len(stringables))
	for i, s := range stringables {
		stringslice[i] = s.String()
	}
	return stringslice
}

func (errs *syntaxErrors) String() string { return strings.Join(mapString(errs.errs), "\n") }

type parseErrorListener struct {
	antlr.DefaultErrorListener
	errs *syntaxErrors
}

func (d *parseErrorListener) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, e antlr.RecognitionException) {

	d.errs.add(line, column, msg)
}

func ParseStream(is antlr.CharStream) (*instruction.Module, error) {
	var err error
	var program *instruction.Module
	func() {
		defer func() {
			if e := recover(); e != nil {
				err = fmt.Errorf("error parsing file: %s", e)
				debug.PrintStack()
			}
		}()

		errorListener := &parseErrorListener{errs: &syntaxErrors{}}
		lexer := parsing.NewRISCVASMLexer(is)
		stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
		lexer.RemoveErrorListeners()
		lexer.AddErrorListener(errorListener)

		p := parsing.NewRISCVASMParser(stream)
		p.RemoveErrorListeners()
		p.AddErrorListener(errorListener)

		listener := NewListener()

		module := p.Module()
		if !errorListener.errs.empty() {
			panic(errorListener.errs)
		}
		// Finally parse the expression
		antlr.ParseTreeWalkerDefault.Walk(listener, module)

		listener.Pop(1)
		program = Dequeue[*instruction.Module](listener)
	}()
	return program, err
}
