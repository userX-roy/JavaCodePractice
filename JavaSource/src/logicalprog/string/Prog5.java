//checking a given string is Palindrome or Not

package logicalprog.string;

import java.util.Scanner;

public class Prog5 {

	boolean checkingPalindrome(String str) {
		
		//Reversing the String input
		String reverserString="";
		char collectionChar;
		
		for (int i = str.length()-1; i >= 0; i--) {
			collectionChar =str.charAt(i);
			
			reverserString = reverserString + collectionChar;
		}
		
		System.out.println("Reverse of the String is : "+reverserString);
		
		//comparing if both the string are same or not
		
		if (str.equalsIgnoreCase(reverserString)) {
			
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please input your String : ");
		
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		scanner.close();
		boolean result = new Prog5().checkingPalindrome(inputString);
		
		if (result)
			System.out.println("Yes , "+inputString+" is a palindrome");
		else
			System.out.println("No , "+inputString+" is not a palindrome");

	}

}
