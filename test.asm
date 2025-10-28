# Grow Stack
addi    sp, sp, -0xF

# Add "Hell" to stack
lui     t0, 0x6c6c6548
addi    t0, t0, 0x6c6c6548
sw      sp, t0, 0

# Add "o Wo" to stack
lui     t0, 0x6f57206f
addi    t0, t0, 0x6f57206f
sw      sp, t0, 0x4

# Add "rld!" to stack
lui     t0, 0x21647c72
addi    t0, t0, 0x21647c72
sw      sp, t0, 0x8

# Add "\n" to stack
lui     t0, 0xa
addi    t0, t0, 0xa
sw      sp, t0, 0xc

# Setup Repition
addi    s1, s1, 0x5

# Setup SysCall Parameters for Writing to STDOUT
addi    a0, zero, 0x1
addi    a1, sp, 0
addi    a2, zero, 0xd
addi    a7, zero, 0x40
ecall 

addi    s1, s1, -0x1
bge     s1, zero, -0x18

# Setup SysCall Parameters for Exit
addi    a0, zero, 0x0
addi    a7, zero, 0x5D
ecall 

