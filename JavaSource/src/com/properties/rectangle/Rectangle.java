package com.properties.rectangle;

public class Rectangle {
	double length;
	double breadth;
	
	
	public void perimeter(double length , double breadth) {
		double per = 2*(length + breadth);
		System.out.println("Perimeter of the rectangle is "+per);
	}
	
	public void area(double length , double breadth) {
		double aRea = length * breadth;
		System.out.println("Area of the rectangle is "+aRea);
	}
}
