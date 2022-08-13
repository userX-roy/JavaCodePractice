/*
 * Calculate the area of different figures like rectangle, square, circle. Input the operands by the user for side length or radius. For performing the same create a different class Area and make the methods for the different figures. Then in the Main class, use the Area class to perform these operations.
Example -
Input: Radius = 3
Output: 28.26
 */


package problem.solving.java;

import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//taking input for function parameter
		float radius = scanner.nextFloat();
		float length = scanner.nextFloat();
		float breadth = scanner.nextFloat();
		float sideLength = scanner.nextFloat();
		
		scanner.close();
		
		//creation of object
		Area area = new Area();
		
		//variable for taking user input
		float circleArea = area.circle(radius);
		float rectangleArea = area.rectangle(length , breadth);
		float sqareArea = area.square(sideLength);
		
		
		System.out.println(circleArea);
		System.out.println(rectangleArea);
		System.out.println(sqareArea);
		
	}

}

class Area {
	
	static final float PI = 3.14f;
	
	public float rectangle(float length , float breadth) {
		
		float area = length * breadth;
		
		return area;
	}
    
	public float circle(float radius) {
		
		float area = PI * (radius * radius);
		
		return area;
	}
    
    public float square(float sideLeangth) {
		
		float area = sideLeangth * sideLeangth;
		
		return area;
	}
    
	
}
