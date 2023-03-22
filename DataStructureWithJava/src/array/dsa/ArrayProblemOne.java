//All Array Problems in this package taken from this video : https://youtu.be/-diAQjYdh_8


package array.dsa;

import java.util.Scanner;

public class ArrayProblemOne {

	int meth1(int[] arr) {
		if (arr.length==0) {
			return 0;
		}
		else {
			return arr[0]+arr[1];
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Array Element : ");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(new ArrayProblemOne().meth1(arr));
		sc.close();

	}

}
