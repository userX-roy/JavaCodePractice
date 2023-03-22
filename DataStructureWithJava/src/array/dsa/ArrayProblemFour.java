package array.dsa;

import java.util.Scanner;

public class ArrayProblemFour {

	int[] meth1(int[] arr1) {
		if (arr1.length>0) {
			int k = arr1.length;
			int arr2[] = new int[k*2];
			arr2[arr2.length-1]=arr1[arr1.length-1];
			return arr2;
		}else {
			return arr1;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Array Elements : ");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] arr1 = new ArrayProblemFour().meth1(arr);
		for (int i : arr1) {
			System.out.print(i +" ");
		}
		sc.close();
		
		
	}

}
