package elfcreator

type EHEndianness uint8

const (
	EHEndianness_Little EHEndianness = 1
	EHEndianness_Big    EHEndianness = 2
)

type EHOSABI uint8

const (
	EHOSABI_System_V EHOSABI = 0x00
	EHOSABI_HP_UX    EHOSABI = 0x01
	EHOSABI_NetBSD   EHOSABI = 0x02
	EHOSABI_Linux    EHOSABI = 0x03
	EHOSABI_GNU_Hurd EHOSABI = 0x04
	_
	EHOSABI_Solaris                      EHOSABI = 0x06
	EHOSABI_AIX                          EHOSABI = 0x07
	EHOSABI_IRIX                         EHOSABI = 0x08
	EHOSABI_FreeBSD                      EHOSABI = 0x09
	EHOSABI_Tru64                        EHOSABI = 0x0A
	EHOSABI_Novel_Modesto                EHOSABI = 0x0B
	EHOSABI_OpenBSD                      EHOSABI = 0x0C
	EHOSABI_OpenVMS                      EHOSABI = 0x0D
	EHOSABI_NonStopKernel                EHOSABI = 0x0E
	EHOSABI_AROS                         EHOSABI = 0x0F
	EHOSABI_FenixOS                      EHOSABI = 0x10
	EHOSABI_Nuxi_CloudABI                EHOSABI = 0x11
	EHOSABI_Stratus_Technologies_OpenVOS EHOSABI = 0x12
)

type ABIVersion uint8

type EHType uint8

const (
	EHType_NONE EHType = 0x00
	EHType_REL  EHType = 0x01
	EHType_EXEC EHType = 0x02
	EHType_DYN  EHType = 0x03
	EHType_CORE EHType = 0x04
)

type EHMachine uint16

const (
	EHMachine_NS                                     EHMachine = 0x00  // No specific instruction set
	EHMachine_AT_T_WE_32100                          EHMachine = 0x01  // AT&T WE 32100
	EHMachine_SPARC                                  EHMachine = 0x02  // SPARC
	EHMachine_x86                                    EHMachine = 0x03  // x86
	EHMachine_M68k                                   EHMachine = 0x04  // Motorola 68000 (M68k)
	EHMachine_M88k                                   EHMachine = 0x05  // Motorola 88000 (M88k)
	EHMachine_Intel_MCU                              EHMachine = 0x06  // Intel MCU
	EHMachine_Intel_80860                            EHMachine = 0x07  // Intel 80860
	EHMachine_MIPS                                   EHMachine = 0x08  // MIPS
	EHMachine_IBM_System_370                         EHMachine = 0x09  // IBM System/370
	EHMachine_MIPS_RS3000_LE                         EHMachine = 0x0A  // MIPS RS3000 Little-endian
	EHMachine_HP_PA_RISC                             EHMachine = 0x0F  // Hewlett-Packard PA-RISC
	EHMachine_Intel_80960                            EHMachine = 0x13  // Intel 80960
	EHMachine_PowerPC                                EHMachine = 0x14  // PowerPC
	EHMachine_PowerPC_64bit                          EHMachine = 0x15  // PowerPC (64-bit)
	EHMachine_S390                                   EHMachine = 0x16  // S390, including S390x
	EHMachine_IBM_SPU_SPC                            EHMachine = 0x17  // IBM SPU/SPC
	EHMachine_NEC_V800                               EHMachine = 0x24  // NEC V800
	EHMachine_Fujitsu_FR20                           EHMachine = 0x25  // Fujitsu FR20
	EHMachine_TRW_RH_32                              EHMachine = 0x26  // TRW RH-32
	EHMachine_Motorola_RCE                           EHMachine = 0x27  // Motorola RCE
	EHMachine_ARMV7                                  EHMachine = 0x28  // Arm (up to Armv7/AArch32)
	EHMachine_Digital_Alpha                          EHMachine = 0x29  // Digital Alpha
	EHMachine_SuperH                                 EHMachine = 0x2A  // SuperH
	EHMachine_SPARC_V9                               EHMachine = 0x2B  // SPARC Version 9
	EHMachine_Siemens_TriCore                        EHMachine = 0x2C  // Siemens TriCore embedded processor
	EHMachine_Argonaut_RISC_Core                     EHMachine = 0x2D  // Argonaut RISC Core
	EHMachine_Hitachi_H8_300                         EHMachine = 0x2E  // Hitachi H8/300
	EHMachine_Hitachi_H8_300H                        EHMachine = 0x2F  // Hitachi H8/300H
	EHMachine_Hitachi_H8S                            EHMachine = 0x30  // Hitachi H8S
	EHMachine_Hitachi_H8_500                         EHMachine = 0x31  // Hitachi H8/500
	EHMachine_IA_64                                  EHMachine = 0x32  // IA-64
	EHMachine_Standford_MIPS_X                       EHMachine = 0x33  // Stanford MIPS-X
	EHMachine_Motorola_ColdFire                      EHMachine = 0x34  // Motorola ColdFire
	EHMachine_Motorola_M68HC12                       EHMachine = 0x35  // Motorola M68HC12
	EHMachine_Fujitsu_MMA_Multimedia_Accelerator     EHMachine = 0x36  // Fujitsu MMA Multimedia Accelerator
	EHMachine_Siemens_PCP                            EHMachine = 0x37  // Siemens PCP
	EHMachine_Sony_nCPU_RISC                         EHMachine = 0x38  // Sony nCPU embedded RISC processor
	EHMachine_Denso_NDR1                             EHMachine = 0x39  // Denso NDR1 microprocessor
	EHMachine_Motorola_Star_Core                     EHMachine = 0x3A  // Motorola Star*Core processor
	EHMachine_Toyota_ME16                            EHMachine = 0x3B  // Toyota ME16 processor
	EHMachine_STMicroelectronics_ST100               EHMachine = 0x3C  // STMicroelectronics ST100 processor
	EHMachine_Advanced_Logic_Corp_TinyJ              EHMachine = 0x3D  // Advanced Logic Corp. TinyJ embedded processor family
	EHMachine_AMD_x86_64                             EHMachine = 0x3E  // AMD x86-64
	EHMachine_Sony_DSP                               EHMachine = 0x3F  // Sony DSP Processor
	EHMachine_Digital_Equipment_Corp_PDP_10          EHMachine = 0x40  // Digital Equipment Corp. PDP-10
	EHMachine_Digital_Equipment_Corp_PDP_11          EHMachine = 0x41  // Digital Equipment Corp. PDP-11
	EHMachine_Siemens_FX66                           EHMachine = 0x42  // Siemens FX66 microcontroller
	EHMachine_STMicroelectronics_ST9_Plus_8bit_16bit EHMachine = 0x43  // STMicroelectronics ST9+ 8/16-bit microcontroller
	EHMachine_STMicroelectronics_ST7_8bit            EHMachine = 0x44  // STMicroelectronics ST7 8-bit microcontroller
	EHMachine_Motorola_MC68HC16                      EHMachine = 0x45  // Motorola MC68HC16 Microcontroller
	EHMachine_Motorola_MC68HC11                      EHMachine = 0x46  // Motorola MC68HC11 Microcontroller
	EHMachine_Motorola_MC68HC08                      EHMachine = 0x47  // Motorola MC68HC08 Microcontroller
	EHMachine_Motorola_MC68HC05                      EHMachine = 0x48  // Motorola MC68HC05 Microcontroller
	EHMachine_Silicon_Graphics_SVx                   EHMachine = 0x49  // Silicon Graphics SVx
	EHMachine_STMicroelectronics_ST19_8bit           EHMachine = 0x4A  // STMicroelectronics ST19 8-bit microcontroller
	EHMachine_Digital_VAX                            EHMachine = 0x4B  // Digital VAX
	EHMachine_Axis_Communications_32bit              EHMachine = 0x4C  // Axis Communications 32-bit embedded processor
	EHMachine_Infineon_Technologies_32bit            EHMachine = 0x4D  // Infineon Technologies 32-bit embedded processor
	EHMachine_Element_14_64bit_DSP                   EHMachine = 0x4E  // Element 14 64-bit DSP Processor
	EHMachine_LSI_Logic_16bit_DSP                    EHMachine = 0x4F  // LSI Logic 16-bit DSP Processor
	EHMachine_TMS320C6000                            EHMachine = 0x8C  // TMS320C6000 Family
	EHMachine_MCST_Elbrus_e2k                        EHMachine = 0xAF  // MCST Elbrus e2k
	EHMachine_ARM64                                  EHMachine = 0xB7  // Arm 64-bits (Armv8/AArch64)
	EHMachine_Zilog_Z80                              EHMachine = 0xDC  // Zilog Z80
	EHMachine_RISC_V                                 EHMachine = 0xF3  // RISC-V
	EHMachine_Berkeley_Packet_Filter                 EHMachine = 0xF7  // Berkeley Packet Filter
	EHMachine_WDC_65C816                             EHMachine = 0x101 // WDC 65C816
	EHMachine_LoongArch                              EHMachine = 0x102 // LoongArch
)

type EHVersion uint8

const (
	EHVersion_Current EHVersion = 1
)

type ElfHeaderData struct {
	Endianness EHEndianness
	OSABI      EHOSABI
	ABIVersion uint8
	Type       EHType
	Machine    EHMachine
	Version    EHVersion
	Flags      SHFlags
}
