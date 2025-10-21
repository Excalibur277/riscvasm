package instruction

type typeDefinition struct {
	name           string
	format         string
	description    string
	implementation string
}

func (td typeDefinition) IsInstructionDefinition() {}

func newTypeDefinition(name, format, description, implementation string) typeDefinition {
	return typeDefinition{
		name:           name,
		format:         format,
		description:    description,
		implementation: implementation,
	}
}
