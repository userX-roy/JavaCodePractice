/*
 * WAP to find the first non-reapeated charcater in the given String
 * Software services ====> o
 */

package logicalprog.string;

public class Prog4 {

	void doubleChar(String str) {
		
		int k = 0;
		
		for (char c : str.toCharArray()) {
			/*
			 * Logic explanation :
			 * indexOf() return first index ; lastIndex() returns last index
			 * if first and last Index same that means that char is not repeated
			 */
			if (str.indexOf(c)==str.lastIndexOf(c)) {
				System.out.println("1st Non-repeating char is : "+c);
				k=k+1;
				break;
			}
		}
		
		if (k==0) {
			System.out.println("All char are repeated");
		}
	}
	
	public static void main(String[] args) {
		new Prog4().doubleChar("oelolei");
	}

}
