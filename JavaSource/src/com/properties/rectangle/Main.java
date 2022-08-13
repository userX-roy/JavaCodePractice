package com.properties.rectangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Length and Breadth of Rectangle : ");
		
		rectangle.length = scanner.nextDouble();
		rectangle.breadth = scanner.nextDouble();
		scanner.close();
		
		System.out.println("Entered Length is "+rectangle.length);
		System.out.println("Entered Breadth is "+rectangle.breadth);
		
		System.out.println(" "); //just to beautify the output ;)
		
		rectangle.perimeter(rectangle.length, rectangle.breadth);
		rectangle.area(rectangle.length, rectangle.breadth);
	}
}
