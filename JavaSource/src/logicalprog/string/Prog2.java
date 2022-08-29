/*
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".


    firstTwo("Hello") ? "He"
    firstTwo("abcdefg") ? "ab"
    firstTwo("ab") ? "ab"
 */

package logicalprog.string;

public class Prog2 {
	
	String firstTwo(String str) {
		
		if (str.length()==1 || str=="") {
			System.out.println("String Length 1 or empty string");
			return str;
		}
		
		else {
		String newString = str.substring(0,2);
		return newString;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Prog2().firstTwo("Saikat"));

	}

}
