//Method overloading : same Method name but with different parameters. 

package roy.learn.java;

public class Method_Overloading {
	public static void main(String[] args) {
		sum(); //same name with different parameters
		
		int a = 45 , b = 45;
		sum(a, b); //same name with different parameters
		
		float d=90.0f , e = 90.0f;
		sum(d, e); //same name with different parameters
	}
	
	public static void sum() {
		int add = 7+3;
		System.out.println(add);
	}
	public static void sum(int k , int l) {
		int add = k+l;
		System.out.println(add);
	}
	public static void sum(float k , float l) {
		float add = k+l;
		System.out.println(add);
	}

}


