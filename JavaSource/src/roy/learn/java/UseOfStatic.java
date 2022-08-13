package roy.learn.java;

public class UseOfStatic {

	public static void main(String[] args) {
		
		// static variable are class variable , not an Object Variable
		// Use :-  "className.variableName"
		
		Test test = new Test();
		
		Test.EmpId = 04;
		
		test.name = "Saikat Roy";
		
		System.out.println(test.name);
		System.out.println(Test.EmpId);
		System.out.println(Test.companyString);
		
		System.out.println("-----------------------------------------------------------------");
		Test.myStaticMethod();
		

	}

}

class Test{

	public static final String companyString = "Google"; // final keyword for making the var as constant
    
	public static int EmpId;
    
    public String name;
    
    public static void myStaticMethod() {
    	
    	System.out.println("My 1st static method");
    	
    	/*
    	 * we can't use non-static method and
    	   variable inside a static method
    	 */
    	Test2.Hello();
    	System.out.println(Test2.myStr);
    	
	}
}

class Test2{
	public static String myStr = "Static method can only call a static variable";
	public static void Hello(){
		System.out.println("A static Method , called from another static method");
		
	}
	
}
