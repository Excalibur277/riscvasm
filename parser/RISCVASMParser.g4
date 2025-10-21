// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, singleLineOverrulesHangingColon true, alignColons hanging
parser grammar RISCVASMParser;

options {
    tokenVocab = RISCVASMLexer;
}

// Module
module
    : NEWLINE* lines NEWLINE* EOF
    ;

lines
    : WHITESPACE? line WHITESPACE?                # LinesInitial
    | lines NEWLINE+ WHITESPACE? line WHITESPACE? # LinesAppend
    ;

line
    : instruction                                           # InstructionLine
    | label = IDENTIFIER COLON (WHITESPACE | NEWLINE)* line # LabelInstructionLine
    ;

instruction
    : inst = IDENTIFIER                     # NoOperandInstruction
    | inst = IDENTIFIER WHITESPACE operands # OperandInstruction
    ;

operands
    : operand                                        # OperandsInitial
    | operands WHITESPACE? COMMA WHITESPACE? operand # OperandsAppend
    ;

operand
    : identifier = IDENTIFIER # OperandIdentifier
    | numeric                 # OperandNumeric
    ;

numeric
    : val = DEC # NumericDec
    | val = HEX # NumericHex
    | val = BIN # NumericBin
    ;