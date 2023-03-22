package array.dsa;

import java.util.Scanner;

public class ArrayProblemThree {

	boolean meth1(int[] arr1 , int[] arr2) {
		if (arr1[0]==arr2[0]||arr1[arr1.length-1]==arr2[arr2.length-1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("Enter Array::1 Element : ");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[4];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Array::2 Element : ");
		
		int[] arr2 = new int[4];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println(new ArrayProblemThree().meth1(arr1,arr2));
		sc.close();

	}

}
