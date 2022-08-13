package com.iinterface;

public interface Animal{
	abstract public void run();
	
	/*
	 inside INTERFACE methods are PUBLIC and ABSTRACT bydefault
	 
	 it's not recomended to use field variable inside interface
	 if it necessary of use variable then it must be constant
	 so it must be declare using public , static , final keyword
	 */
	
	void eat();
	/*
	  an interface will contain only ABSTRACT methods , normal medhos are not allowed inside
	  interface....
	  
	  we have to use implement keyword for creating inheritance of an interface.....
	 */
}