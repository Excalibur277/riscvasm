// $antlr-format alignTrailingComments true, columnLimit 150, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine true, allowShortBlocksOnASingleLine true, minEmptyLines 0, alignSemicolons ownLine
// $antlr-format alignColons trailing, singleLineOverrulesHangingColon true, alignLexerCommands true, alignLabels true, alignTrailers true

lexer grammar RISCVASMLexer;

COLON      : ':';
COMMA      : ',';
ADD        : '+';
SUB        : '-';
MUL        : '*';
WHITESPACE : (' ' | '\t')+;
NEWLINE    : '\n';

IDENTIFIER: [\p{L}_.] [\p{L}\p{N}_.]*;

DEC : ('0d' [\p{N}]+) | ([\p{N}]+);
HEX : '0x' [\p{N}a-fA-F]+;
BIN : '0b' [12]+;

COMMENT: '#' (~[\r\n])* -> channel(HIDDEN);