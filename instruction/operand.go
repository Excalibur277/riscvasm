package instruction

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

type Operand interface {
	IsOperand()
}

type CSR uint16

func (i CSR) IsOperand() {}

type AquireMemOrderFlag uint8

func (aq AquireMemOrderFlag) IsOperand() {}

type ReleaseMemOrderFlag uint8

func (rl ReleaseMemOrderFlag) IsOperand() {}

type RoundingMode uint8

func (rm RoundingMode) IsOperand() {}

type Immediate uint32

func (i Immediate) IsOperand() {}

func ImmediateDec(val string) Immediate {
	val = strings.Replace(val, "0d", "", 1)
	if val[:1] == "-" {
		v, err := strconv.ParseInt(val, 10, 32)
		if err != nil {
			panic(err)
		}
		if v > math.MaxUint32 {
			panic(fmt.Errorf("overflowed uint32 with: 0d%s", val))
		}
		return Immediate(v)
	} else {
		v, err := strconv.ParseUint(val, 10, 32)
		if err != nil {
			panic(err)
		}
		if v > math.MaxUint32 {
			panic(fmt.Errorf("overflowed uint32 with: 0d%s", val))
		}
		return Immediate(v)
	}
}

func ImmediateHex(val string) Immediate {
	val = strings.Replace(val, "0x", "", 1)
	if val[:1] == "-" {
		v, err := strconv.ParseInt(val, 16, 32)
		if err != nil {
			panic(err)
		}
		if v > math.MaxUint32 {
			panic(fmt.Errorf("overflowed uint32 with: 0x%s", val))
		}
		return Immediate(v)
	} else {
		v, err := strconv.ParseUint(val, 16, 32)
		if err != nil {
			panic(err)
		}
		if v > math.MaxUint32 {
			panic(fmt.Errorf("overflowed uint32 with: 0x%s", val))
		}
		return Immediate(v)
	}
}

func ImmediateBin(val string) Immediate {
	val = strings.Replace(val, "0b", "", 1)
	if val[:1] == "-" {
		v, err := strconv.ParseInt(val, 2, 32)
		if err != nil {
			panic(err)
		}
		if v > math.MaxUint32 {
			panic(fmt.Errorf("overflowed uint32 with: 0b%s", val))
		}
		return Immediate(v)
	} else {
		v, err := strconv.ParseUint(val, 2, 32)
		if err != nil {
			panic(err)
		}
		if v > math.MaxUint32 {
			panic(fmt.Errorf("overflowed uint32 with: 0b%s", val))
		}
		return Immediate(v)
	}
}

func Cast[O Operand](o Operand) (O, error) {
	val, ok := o.(O)
	if !ok {
		return val, fmt.Errorf("cannot case type %T as %T", o, new(O))
	} else {
		return val, nil
	}
}

func Cast1[O1 Operand](ops []Operand) (val1 O1, err error) {
	if len(ops) != 1 {
		err = fmt.Errorf("got %d operands, expected %d", len(ops), 1)
		return
	}
	val1, err = Cast[O1](ops[0])
	return
}

func Cast2[O1, O2 Operand](ops []Operand) (val1 O1, val2 O2, err error) {
	if len(ops) != 2 {
		err = fmt.Errorf("got %d operands, expected %d", len(ops), 2)
		return
	}
	val1, err = Cast[O1](ops[0])
	if err != nil {
		return
	}
	val2, err = Cast[O2](ops[1])
	return
}

func Cast3[O1, O2, O3 Operand](ops []Operand) (val1 O1, val2 O2, val3 O3, err error) {
	if len(ops) != 3 {
		err = fmt.Errorf("got %d operands, expected %d", len(ops), 3)
		return
	}
	val1, err = Cast[O1](ops[0])
	if err != nil {
		return
	}
	val2, err = Cast[O2](ops[1])
	if err != nil {
		return
	}
	val3, err = Cast[O3](ops[2])
	return
}

func Cast4[O1, O2, O3, O4 Operand](ops []Operand) (val1 O1, val2 O2, val3 O3, val4 O4, err error) {
	if len(ops) != 4 {
		err = fmt.Errorf("got %d operands, expected %d", len(ops), 4)
		return
	}
	val1, err = Cast[O1](ops[0])
	if err != nil {
		return
	}
	val2, err = Cast[O2](ops[1])
	if err != nil {
		return
	}
	val3, err = Cast[O3](ops[2])
	if err != nil {
		return
	}
	val4, err = Cast[O4](ops[3])
	return
}

func Cast5[O1, O2, O3, O4, O5 Operand](ops []Operand) (val1 O1, val2 O2, val3 O3, val4 O4, val5 O5, err error) {
	if len(ops) != 5 {
		err = fmt.Errorf("got %d operands, expected %d", len(ops), 5)
		return
	}
	val1, err = Cast[O1](ops[0])
	if err != nil {
		return
	}
	val2, err = Cast[O2](ops[1])
	if err != nil {
		return
	}
	val3, err = Cast[O3](ops[2])
	if err != nil {
		return
	}
	val4, err = Cast[O4](ops[3])
	if err != nil {
		return
	}
	val5, err = Cast[O5](ops[4])
	return
}

func GetOperand(val string) Operand {
	for _, source := range operandsources {
		if op, ok := source[strings.ToLower(val)]; ok {
			return op
		}
	}
	panic(fmt.Errorf("could not find operand: '%s'", val))
}

var operandsources = map[string]map[string]Operand{
	"Register": intReg32,
}
