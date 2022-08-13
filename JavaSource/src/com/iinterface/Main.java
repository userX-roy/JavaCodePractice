package com.iinterface;

public class Main {

	public static void main(String[] args) {
		/*
		  can't create object of interface 
		  new Animal(); -> INVALID
		  but can create referance variable of that interface , i.e. "Animal animal" is valid
		  But we can create child class object and assign to interface ref variable
		  i.e., "Animal animal = new Dog();" is valid
		 */
		Animal animal = new Dog();
		
		animal.eat();
		animal.run();

	}
	
	}
	
	class Dog implements Animal{
		/*
		 We must override all methods of Interface inside child class
		 */

		@Override
		public void run() {
			System.out.println("Dog is running");
			
		}

		@Override
		public void eat() {
			System.out.println("Dog is eatting");
			
		}


}
