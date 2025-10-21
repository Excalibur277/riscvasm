package main

import (
	"bufio"
	"encoding/binary"
	"flag"
	"fmt"
	"math"
	"os"
	"os/exec"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"riscvasm.com/m/v2/elf64writer"
	"riscvasm.com/m/v2/elfcreator"
	"riscvasm.com/m/v2/instruction"
	"riscvasm.com/m/v2/instructions"
	"riscvasm.com/m/v2/listener"
)

func main() {
	flag.Parse()
	args := flag.Args()
	if len(args) != 2 {
		fmt.Printf("Requires 2 and only 2 positional commandline arguments, inputfilename and outputfilename, got: %d\n", len(args))
		fmt.Println(strings.Join(args, ", "))
		return
	}
	sourceFilename := args[0]
	binaryFilename := args[1]

	f, err := os.Open(sourceFilename)
	if err != nil {
		fmt.Println(err)
		return
	}
	defer f.Close()

	is := antlr.NewIoStream(bufio.NewReader(f))

	module, err := listener.ParseStream(is)
	if err != nil {
		fmt.Println(err)
		return
	}

	data := elfcreator.ElfHeaderData{Endianness: elfcreator.EHEndianness_Little, OSABI: elfcreator.EHOSABI_System_V, Type: elfcreator.EHType_REL, Machine: elfcreator.EHMachine_RISC_V, Version: elfcreator.EHVersion_Current, Flags: 0}
	elf64 := elf64writer.Create(data)
	elf64.AddSection(elfcreator.NewTextSection(module.Construct(), []elfcreator.Symbol{{Name: "_start", Offset: 0, Size: 0, Bind: elfcreator.STB_GLOBAL, Type: elfcreator.STT_NOTYPE}}))
	elf64.Complete(sourceFilename)
	writer, err := os.Create(binaryFilename + ".o")
	if err != nil {
		fmt.Println(err)
		return
	}
	err = elf64.Write(writer)
	if err != nil {
		fmt.Println(err)
		return
	}

	writer.Close()
	cmd := exec.Command("riscv64-unknown-elf-ld", "-o", binaryFilename, binaryFilename+".o")
	cmd.Stderr = os.Stderr
	cmd.Stdout = os.Stdout
	err = cmd.Run()
	if err != nil {
		fmt.Println("Error Building Binary")
		fmt.Println(err)
		return
	}

}

func assemble() []byte {
	code := []instruction.Instruction{}

	addCode := func(command string, operands []instruction.Operand) {
		if i, err := instructions.Construct(command, operands); err == nil {
			code = append(code, i)
		} else {
			panic(err)
		}
	}
	addCode("addi", []instruction.Operand{instruction.SP, instruction.SP, instruction.Immediate((uint32)(math.MaxUint32 + 1 - 0x10))})

	addCode("lui", []instruction.Operand{instruction.T0, instruction.Immediate(0x6c6c6548)})
	addCode("addi", []instruction.Operand{instruction.T0, instruction.T0, instruction.Immediate(0x6c6c6548)})
	addCode("sw", []instruction.Operand{instruction.SP, instruction.T0, instruction.Immediate(0)})

	addCode("lui", []instruction.Operand{instruction.T0, instruction.Immediate(0x6f57206f)})
	addCode("addi", []instruction.Operand{instruction.T0, instruction.T0, instruction.Immediate(0x6f57206f)})
	addCode("sw", []instruction.Operand{instruction.SP, instruction.T0, instruction.Immediate(0x4)})

	addCode("lui", []instruction.Operand{instruction.T0, instruction.Immediate(0x21647c72)})
	addCode("addi", []instruction.Operand{instruction.T0, instruction.T0, instruction.Immediate(0x21647c72)})
	addCode("sw", []instruction.Operand{instruction.SP, instruction.T0, instruction.Immediate(0x8)})

	addCode("lui", []instruction.Operand{instruction.T0, instruction.Immediate(0xa)})
	addCode("addi", []instruction.Operand{instruction.T0, instruction.T0, instruction.Immediate(0xa)})
	addCode("sw", []instruction.Operand{instruction.SP, instruction.T0, instruction.Immediate(0xc)})

	addCode("addi", []instruction.Operand{instruction.A0, instruction.ZERO, instruction.Immediate(0x1)})
	addCode("addi", []instruction.Operand{instruction.A1, instruction.SP, instruction.Immediate(0)})
	addCode("addi", []instruction.Operand{instruction.A2, instruction.ZERO, instruction.Immediate(0xd)})
	addCode("addi", []instruction.Operand{instruction.A7, instruction.ZERO, instruction.Immediate(0x40)})

	addCode("ecall", []instruction.Operand{})

	addCode("addi", []instruction.Operand{instruction.A0, instruction.ZERO, instruction.Immediate(0x0)})
	addCode("addi", []instruction.Operand{instruction.A7, instruction.ZERO, instruction.Immediate(0x5D)})
	addCode("ecall", []instruction.Operand{})

	bytecode := make([]byte, 0, len(code)*4)

	for _, instruction := range code {
		bytecode = binary.LittleEndian.AppendUint32(bytecode, uint32(instruction.Construct()))
	}

	return bytecode
}
