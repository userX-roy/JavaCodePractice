package com.java.constractor;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dog d1 = new Dog();
		Dog d2 = new Dog(50.2f, "Black" , "Indian");
		
		System.out.println(d2.breed);
		System.out.println(d2.colour);
		System.out.println(d2.size);
	}
}
