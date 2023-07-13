//2D Array implementation
package com.array.basics;

import java.util.Scanner;

public class ArrayBasic {

	void meth2() {
		String[] arr = {"Saikat","Roy","Hossenpur","String Array"};
		arr[3]=null;
		for(String data:arr) {
			System.out.print(data+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = new int[3][4];
		
		System.out.println("Enter Array Elements : ");
		Scanner scanner = new Scanner(System.in);
	
		//Taking input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		
		//Printing in matrix form :->
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		new ArrayBasic().meth2();
	
	
		scanner.close();
	}

}
