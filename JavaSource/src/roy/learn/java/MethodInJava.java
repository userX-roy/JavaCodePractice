package roy.learn.java;

import java.util.Scanner;

public class MethodInJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 number for addition : ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int sum = SUM(a,b); //Method call
		System.out.println("Addition of "+a+" and "+b+" is "+sum);
		
	}
	
	//Method define
	public static int SUM(int k , int l) {
		int add = k+l;
		return add;
	}

}
