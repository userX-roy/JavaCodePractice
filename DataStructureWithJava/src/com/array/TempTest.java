package com.array;

public class TempTest {

	static int arr[] = new int[] {21,34,45};
	
	public static void main(String[] args) {
		//int arr[] = new int[] {21,34,45};
		for (int i : arr) {
			System.out.println(i);
		}
		
		new TempTest().arrayChange(arr);
		
		for (int j : arr) {
			System.out.println(j);
		}
	}
	
	
	void arrayChange(int[] arr2) {
		arr2[2]=arr[1];
	}

}
