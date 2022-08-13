package com.getterSetter.java;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setColour("Black");
		dog.setBreed("Indian street dog");
		dog.setSize(34.6f);
		
		System.out.println(dog.getBreed());
		System.out.println(dog.getColour());
		System.out.println(dog.getSize());
	}
}
