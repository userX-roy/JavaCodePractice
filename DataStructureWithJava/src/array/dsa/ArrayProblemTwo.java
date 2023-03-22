package array.dsa;

import java.util.Scanner;

public class ArrayProblemTwo {

	
	boolean meth1(int[] arr) {
		
		//returning true if 1st or last element is equals to 6
		if (arr[0]==6||arr[(arr.length)-1]==6) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Array Element : ");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(new ArrayProblemTwo().meth1(arr));
		sc.close();

	}

}
