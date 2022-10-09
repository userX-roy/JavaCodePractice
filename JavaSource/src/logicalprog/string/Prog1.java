/*
 * Given a string, return a new string made of 3 copies of the last 2 chars 
   of the original string. The string length will be at least 2.

   extraEnd("Hello") ? "lololo"
   extraEnd("ab") ? "ababab"
   extraEnd("Hi") ? "HiHiHi"
 */

package logicalprog.string;

public class Prog1 {
	String extraEnd(String str) {
		System.out.println(str.length());
		
		String newString = str.substring(str.length()-2,str.length());
		
		return (newString+newString+newString);
	}
	
	public static void main(String[] args) {
		String resultString = new Prog1().extraEnd("Saikat");
		
		System.out.println(resultString);

	}

}
