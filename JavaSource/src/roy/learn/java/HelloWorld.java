package roy.learn.java;

public class HelloWorld {
	
	void method1() {
		System.out.println("Hello World in Java");
		
	}
	
	
	public static void main(String[] args) {
		//System.out.println("Java is better than C in Software development");
		
		HelloWorld hw = new HelloWorld();
		hw.method1();
		System.out.println("-----------------------------");
		String str=hw.toString();
		
		//int i = hw.hashCode();
		
		System.out.println("Output from HashCode Method : "+hw.hashCode());
		
		System.out.println("Output from toString method : "+str);
	}

}
