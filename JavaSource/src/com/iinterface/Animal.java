package com.iinterface;

public interface Animal{
	
	/*
	 * from java 1.8 onwards default and static methods are also allowed including main().
	 */ 
	
	default void sound() {
		System.out.println("Animal can Sound ");
	}
	
	abstract public void run();
	
	/*
	 inside INTERFACE methods are PUBLIC and ABSTRACT by default
	 
	 it's not recommended to use field variable inside interface
	 if it necessary of use variable then it must be constant
	 so it must be declare using public , static , final keyword
	 */
	
	void eat();
	/*
	  an interface will contain only ABSTRACT methods , normal methods are not allowed inside
	  interface....
	  
	  we have to use implement keyword for creating inheritance of an interface.....
	 */
}