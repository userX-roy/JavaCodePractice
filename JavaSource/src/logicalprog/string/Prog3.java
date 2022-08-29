/*
 * Given a string, return true if the first 2 chars in the string also appear at the end 
 * of the string, such as with "edited".
   frontAgain("edited") ? true
   frontAgain("edit") ? false
   frontAgain("ed") ? true
 */

package logicalprog.string;

public class Prog3 {
	boolean frontAgain(String str) {
		//we are converting all cases into Lowercase , you can use eqalsIgnorecase() methods
		String forntString = str.toLowerCase().substring(0, 2);
		String endString = str.toLowerCase().substring(str.length()-2, str.length());
		
		if (forntString.equals(endString)) {
			return true;
		} else {
			return false;

		}
	}

	
	public static void main(String[] args) {
		System.out.println(new Prog3().frontAgain("Wohwo"));
		System.out.println(new Prog3().frontAgain("Eghgfd"));
	}

}
