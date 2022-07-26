package com.bilgeadam.model;

public enum Race {
	
	HOBBIT("Hobbit",false, Alignment.GOOD), 
	MAIA("Maia",true,Alignment.GOOD),
	MAN("Man",false, Alignment.NEUTRAL),
	ELF("Elf", true,Alignment.SUPER_GOOD),
	DWARF("Dwarf", false, Alignment.GOOD),
	ORC("Orc", false, Alignment.EVIL);
	
	
	private final String name;
	private final boolean immortal;
	private Alignment alignment;
	
	private Race(String name, boolean immortal, Alignment alignment) {
		this.name = name;
		this.immortal = immortal;
		this.alignment = alignment;
	}

	public String getName() {
		return name;
	}

	public boolean isImmortal() {
		return immortal;
	}

	public Alignment getAlignment() {
		return alignment;
	}
	
	
}
