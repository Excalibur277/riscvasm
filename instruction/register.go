package instruction

type IntReg32 uint8

func (reg IntReg32) IsOperand() {}

const (
	X0 IntReg32 = iota
	X1
	X2
	X3
	X4
	X5
	X6
	X7
	X8
	X9
	X10
	X11
	X12
	X13
	X14
	X15
	X16
	X17
	X18
	X19
	X20
	X21
	X22
	X23
	X24
	X25
	X26
	X27
	X28
	X29
	X30
	X31
)

var intReg32 = map[string]Operand{
	"x0":   X0,
	"x1":   X1,
	"x2":   X2,
	"x3":   X3,
	"x4":   X4,
	"x5":   X5,
	"x6":   X6,
	"x7":   X7,
	"x8":   X8,
	"x9":   X9,
	"x10":  X10,
	"x11":  X11,
	"x12":  X12,
	"x13":  X13,
	"x14":  X14,
	"x15":  X15,
	"x16":  X16,
	"x17":  X17,
	"x18":  X18,
	"x19":  X19,
	"x20":  X20,
	"x21":  X21,
	"x22":  X22,
	"x23":  X23,
	"x24":  X24,
	"x25":  X25,
	"x26":  X26,
	"x27":  X27,
	"x28":  X28,
	"x29":  X29,
	"x30":  X30,
	"x31":  X31,
	"zero": ZERO,
	"ra":   RA,
	"sp":   SP,
	"gp":   GP,
	"tp":   TP,
	"t0":   T0,
	"t1":   T1,
	"t2":   T2,
	"s0":   S0,
	"s1":   S1,
	"a0":   A0,
	"a1":   A1,
	"a2":   A2,
	"a3":   A3,
	"a4":   A4,
	"a5":   A5,
	"a6":   A6,
	"a7":   A7,
	"s2":   S2,
	"s3":   S3,
	"s4":   S4,
	"s5":   S5,
	"s6":   S6,
	"s7":   S7,
	"s8":   S8,
	"s9":   S9,
	"s10":  S10,
	"s11":  S11,
	"s12":  S12,
	"t3":   T3,
	"t4":   T4,
	"t5":   T5,
	"t6":   T6,
}

const (
	ZERO IntReg32 = iota
	RA
	SP
	GP
	TP
	T0
	T1
	T2
	S0
	S1
	A0
	A1
	A2
	A3
	A4
	A5
	A6
	A7
	S2
	S3
	S4
	S5
	S6
	S7
	S8
	S9
	S10
	S11
	S12
	T3
	T4
	T5
	T6
)

type FloatReg32 uint8

func (reg FloatReg32) IsOperand() {}

const (
	F0 FloatReg32 = 0
	F1            = iota
	F2
	F3
	F4
	F5
	F6
	F7
	F8
	F9
	F10
	F11
	F12
	F13
	F14
	F15
	F16
	F17
	F18
	F19
	F20
	F21
	F22
	F23
	F24
	F25
	F26
	F27
	F28
	F29
	F30
	F31
)

var floatReg32 = map[string]Operand{
	"f0":  X0,
	"f1":  X1,
	"f2":  X2,
	"f3":  X3,
	"f4":  X4,
	"f5":  X5,
	"f6":  X6,
	"f7":  X7,
	"f8":  X8,
	"f9":  X9,
	"f10": X10,
	"f11": X11,
	"f12": X12,
	"f13": X13,
	"f14": X14,
	"f15": X15,
	"f16": X16,
	"f17": X17,
	"f18": X18,
	"f19": X19,
	"f20": X20,
	"f21": X21,
	"f22": X22,
	"f23": X23,
	"f24": X24,
	"f25": X25,
	"f26": X26,
	"f27": X27,
	"f28": X28,
	"f29": X29,
	"f30": X30,
	"f31": X31,
}
