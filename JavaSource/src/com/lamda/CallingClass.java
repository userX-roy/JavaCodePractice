package com.lamda;

public class CallingClass {

	
	/*
	 * Lamda Expression is alternative to implementation of Abstract Method.
	 * Lamda Expression can only be used for Functional Interface (i.e., Interface having only one abstract method)
	 * Lamda Expression always ends with semicolon ;
	 * if the abstract method is returning something lamda expression will not bother about returning value , returned value should be accepted while method call
	 * 
	 */
	
	void meth3() {
		System.out.println("Meth for understanding method referancing");
	}
	
	
	
	void meth1(int h) {
		System.out.println("CallingClass meth1");
		InterfaceA ia = (int m)-> System.out.println("Hello Roy "+m);
		ia.meth1(104);
	}
	
	void meth2() {
		System.out.println("CallingClass meth2");
		
		InterfaceB ib =(int k , int l)->
		{
			int c = k+l;
			return c;		//implementation of abstract method in the form of Lambda expression.
		};
		
		int c = ib.meth2(12, 45);
		System.out.println("sum of 12 and 45 : "+c);
	}
	
	void meth4() {
		System.out.println("CallingClass meth4");
		
		/*
		 * this one is called method referancing : whenever we need to implement an existing
		 * method to a lambda expression we use this , even we can use static method and
		 * constractor :
		 * 
		 * InterfaceC ic = CallingClass::new --------> using constractor
		 * InterfaceC ic = CallingClass::meth3 --------> using static method 
		 * 
		 * NB: No Need of Parenthesis after method name
		 */
		InterfaceC ic = new CallingClass()::meth3;
		ic.meth3();
	}
	
	public static void main(String[] args) {
		new CallingClass().meth1(23);
		new CallingClass().meth2();
		new CallingClass().meth4();

	}

}
