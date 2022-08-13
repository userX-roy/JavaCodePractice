package com.java.constractor;

public class Dog {
	float size;
	String colour , breed;
	
	public Dog() {
		System.out.println("Default constractor trigered");
	}
	
	public Dog(float size , String colour , String breed) {
		System.out.println("Parameterized constractor trigerred ");
		this.size = size;
		this.colour = colour;
		this.breed = breed;
	}

}
