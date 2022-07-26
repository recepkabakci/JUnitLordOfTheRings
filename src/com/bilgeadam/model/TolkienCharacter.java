package com.bilgeadam.model;

public class TolkienCharacter {
	
	public int age;
	private String name;
	private Race race;
	
	public TolkienCharacter(String name,int age,Race race) {
		super();
		this.age = age;
		this.name = name;
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Race getRace() {
		return race;
	}

	@Override
	public String toString() {
		return "TolkienCharacter [age=" + age + ", name=" + name + ", race=" + race + "]";
	}
	
	
	
}
