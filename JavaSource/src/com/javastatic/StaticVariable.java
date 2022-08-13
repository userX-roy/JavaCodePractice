package com.javastatic;

public class StaticVariable {
	
	int nonStatic = 10;
	static int statVar = 20;
	
	void meth1() {
		System.out.println("-------Mehthod 1---------");
		System.out.println(nonStatic);
		System.out.println(statVar);
		nonStatic = 100;
		statVar = 200;
		System.out.println(nonStatic);
	}
	
	void meth2() {
		System.out.println("-------Mehthod 2---------");
		System.out.println(nonStatic);
		System.out.println(statVar);
		nonStatic = 10000;
		StaticVariable.statVar = 20000;
		System.out.println(nonStatic);
	}
	
	public static void main(String[] args) {
		StaticVariable staticVariable = new StaticVariable();
		staticVariable.meth1();
		staticVariable.meth2();
	}

}
