package roy.learn.java;

import java.util.Scanner;

public class ReversingString {

	String reverString(String str) {
		String reverserString="";
		char collectionChar;
		
		for (int i = str.length()-1; i >= 0; i--) {
			collectionChar =str.charAt(i);
			
			reverserString = reverserString + collectionChar;
		}
		
		return reverserString;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter a String : ");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.next();
		
		System.out.println(new ReversingString().reverString(inputString));
		scanner.close();

	}

}
