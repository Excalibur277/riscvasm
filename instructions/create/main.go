package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	var instructions = []string{}

	var err error
	f, _ := os.Open(os.Args[1])
	in := bufio.NewReader(f)
	var module string
	var repeat bool = true

	module, _ = in.ReadString('\n')
	module = module[:len(module)-1]
	os.MkdirAll(module, os.ModePerm)
	for repeat {
		var instruction, format, description, implementation, opcode string
		instruction, err = in.ReadString('\n')
		if err != nil {
			fmt.Println(err)
			return
		}
		instruction = instruction[:len(instruction)-1]
		format, err = in.ReadString('\n')
		if err != nil {
			fmt.Println(err)
			return
		}
		format = format[:len(format)-1]
		description, err = in.ReadString('\n')
		if err != nil {
			fmt.Println(err)
			return
		}
		description = description[:len(description)-1]
		implementation, err = in.ReadString('\n')
		if err != nil {
			fmt.Println(err)
			return
		}
		implementation = implementation[:len(implementation)-1]
		opcode, err = in.ReadString('\n')
		if err != nil {
			fmt.Println(err)
			return
		}
		opcode = opcode[:len(opcode)-1]

		var encoding string
		encoding, _ = in.ReadString('\n')
		encoding = encoding[:len(encoding)-1]

		safeinstruction := strings.ReplaceAll(instruction, ".", "_")
		instructions = append(instructions, instruction)
		file, err := os.Create(module + "/" + safeinstruction + ".go")

		if err != nil {
			fmt.Println(err)
			return
		}

		if encoding != "constant" && (len(opcode) != 7 || len(strings.ReplaceAll(strings.ReplaceAll(opcode, "0", ""), "1", "")) != 0) {
			fmt.Printf("Opcode must be 7 bits: %s\n", opcode)
			return
		} else if encoding == "constant" && (len(opcode) != 32 || len(strings.ReplaceAll(strings.ReplaceAll(opcode, "0", ""), "1", "")) != 0) {
			fmt.Printf("Constant must be 32 bits: %s\n", opcode)
			return
		}

		file.WriteString(fmt.Sprintf(`package %s

import "riscvasm.com/m/v2/instruction"

var %s instruction.InstructionDefinition = instruction.New%sTypeDefinition(
	`+"`%s`"+`,
	`+"`%s`"+`,
	`+"`%s`"+`,
	`+"`%s`"+`,
	0b0%s,
`, module, safeinstruction, strings.ToUpper(encoding[:1])+encoding[1:], instruction, format, description, implementation, opcode))

		switch encoding {
		case "b", "B", "i", "I", "s", "S", "fence", "FENCE", "Fence", "CSR", "CSRI":
			var funct3 string
			funct3, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct3 = funct3[:len(funct3)-1]
			if len(funct3) != 3 || len(strings.ReplaceAll(strings.ReplaceAll(funct3, "0", ""), "1", "")) != 0 {
				fmt.Println("funct3 must be 3 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b00000%s,\n", funct3))
		case "r", "R", "shamt", "Shamt", "SHAMT":
			var funct3 string
			funct3, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct3 = funct3[:len(funct3)-1]
			if len(funct3) != 3 || len(strings.ReplaceAll(strings.ReplaceAll(funct3, "0", ""), "1", "")) != 0 {
				fmt.Println("funct3 must be 3 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b00000%s,\n", funct3))

			var funct7 string
			funct7, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct7 = funct7[:len(funct7)-1]
			if len(funct7) != 7 || len(strings.ReplaceAll(strings.ReplaceAll(funct7, "0", ""), "1", "")) != 0 {
				fmt.Println("funct7 must be 7 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b0%s,\n", funct7))
		case "r4F", "R4F":
			var funct2 string
			funct2, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct2 = funct2[:len(funct2)-1]
			if len(funct2) != 2 || len(strings.ReplaceAll(strings.ReplaceAll(funct2, "0", ""), "1", "")) != 0 {
				fmt.Println("funct2 must be 2 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b000000%s,\n", funct2))
		case "r2F", "R2F":
			var funct5 string
			funct5, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct5 = funct5[:len(funct5)-1]
			if len(funct5) != 5 || len(strings.ReplaceAll(strings.ReplaceAll(funct5, "0", ""), "1", "")) != 0 {
				fmt.Println("funct5 must be 5 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b000%s,\n", funct5))

			var funct7 string
			funct7, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct7 = funct7[:len(funct7)-1]
			if len(funct7) != 7 || len(strings.ReplaceAll(strings.ReplaceAll(funct7, "0", ""), "1", "")) != 0 {
				fmt.Println("funct7 must be 7 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b0%s,\n", funct7))
		case "r2", "R2":
			var funct3 string
			funct3, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct3 = funct3[:len(funct3)-1]
			if len(funct3) != 3 || len(strings.ReplaceAll(strings.ReplaceAll(funct3, "0", ""), "1", "")) != 0 {
				fmt.Println("funct3 must be 3 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b00000%s,\n", funct3))

			var funct5 string
			funct5, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct5 = funct5[:len(funct5)-1]
			if len(funct5) != 5 || len(strings.ReplaceAll(strings.ReplaceAll(funct5, "0", ""), "1", "")) != 0 {
				fmt.Println("funct5 must be 7 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b0%s,\n", funct5))

			var funct7 string
			funct7, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct7 = funct7[:len(funct7)-1]
			if len(funct7) != 7 || len(strings.ReplaceAll(strings.ReplaceAll(funct7, "0", ""), "1", "")) != 0 {
				fmt.Println("funct7 must be 7 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b0%s,\n", funct7))
		case "a", "aZ", "AZ":
			var funct3 string
			funct3, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct3 = funct3[:len(funct3)-1]
			if len(funct3) != 3 || len(strings.ReplaceAll(strings.ReplaceAll(funct3, "0", ""), "1", "")) != 0 {
				fmt.Println("funct3 must be 3 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b00000%s,\n", funct3))

			var funct5 string
			funct5, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct5 = funct5[:len(funct5)-1]
			if len(funct5) != 5 || len(strings.ReplaceAll(strings.ReplaceAll(funct5, "0", ""), "1", "")) != 0 {
				fmt.Println("funct7 must be 7 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b000%s,\n", funct5))
		case "RF", "rF":
			var funct7 string
			funct7, err = in.ReadString('\n')
			if err != nil {
				fmt.Println(err)
				return
			}
			funct7 = funct7[:len(funct7)-1]
			if len(funct7) != 7 || len(strings.ReplaceAll(strings.ReplaceAll(funct7, "0", ""), "1", "")) != 0 {
				fmt.Println("funct7 must be 7 bits")
				return
			}
			file.WriteString(fmt.Sprintf("    0b0%s,\n", funct7))
		case "constant", "CONSTANT", "Constant", "u", "U", "j", "J":
		default:
			fmt.Println(fmt.Errorf("no real encoding: %s", encoding))
			return
		}

		file.WriteString(")")

		repeat = false
		rep, _ := in.ReadString('\n')
		rep = rep[:len(rep)-1]
		if rep == "T" || rep == "t" {
			repeat = true
		}
	}

	file, _ := os.Create(module + "/0main.go")

	file.WriteString(fmt.Sprintf(`package %s

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
`, module))

	for _, instruction := range instructions {
		safe := strings.ReplaceAll(instruction, ".", "_")
		file.WriteString(fmt.Sprintf(`    "%s": %s,
`, instruction, safe))
	}
	file.WriteString("}")

}
