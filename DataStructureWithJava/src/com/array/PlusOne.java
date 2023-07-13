//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.


package com.array;

public class PlusOne {

	private static int digits[] = new int[] {9,8,7,6,5,4,3,2,1,9,9,9,9,9,9,9,9};
	
	public int[] plusOne(int[] digits) {
		int resultOfDivision=0,extractedNum=0;
		
		int startingDivider = (int)Math.pow(10.0, (double)digits.length-1);
		
		for (int i = 0; i < digits.length; i++) {
			 
			resultOfDivision = digits[i]*startingDivider;
			 
			 extractedNum=resultOfDivision+extractedNum;
			 
			 startingDivider = startingDivider/10;
		}//extracting digits from the array
		
		
		
		Integer mainNumber = extractedNum+1;
		
		
		//getting the length or number of digit by converting the Integer into string.
		int lengthOfNewArray= mainNumber.toString().length();
		
		startingDivider = (int)Math.pow(10.0, (double)lengthOfNewArray-1);
		
		int newArray[] = new int[lengthOfNewArray];
		
		int toStoreRemainder=mainNumber;
		for (int i = 0; i < lengthOfNewArray; i++) {
			resultOfDivision = toStoreRemainder/startingDivider;
			
			newArray[i] = resultOfDivision;
			toStoreRemainder = mainNumber%startingDivider;
			startingDivider = startingDivider/10;
			
		}//Adding the digits of the number after addition
		
		return newArray;
	}
	
	// Solved using Java Library function ->
	public int[] plusOne2(int[] digits) {
		
		String convertedString = new String();
		
		String holdingString;
		
		//Here converting the number array into a String
		for (Integer i : digits) {
			holdingString = Integer.toString(i);
			convertedString = convertedString+holdingString;
		}
		
		//Converting the string into Integer and ADDING 1.
		Long numInteger = Long.parseLong(convertedString);
		numInteger = numInteger+1;
		
		
		//Converting Addition result into String format
		String finalString = numInteger.toString();
		
		//creating an array of 'finalstring' size  to store the integers of the 'numInteger' type
		int [] newArray = new int[finalString.length()];
		
		
		//Converting each and every character of the string into digit and adding them inside the newArray followed by their respective Index
		for (int i = 0; i < newArray.length; i++) {
			
			Character converterChar = finalString.charAt(i);
			
			newArray[i] = Character.getNumericValue(converterChar);
		}
		
		return newArray;
	}
	
	//Best Method
	public int[] plusOne3(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}
	
	
	//CONTROL ROOM ;)
	public static void main(String[] args) {
		int[] temp = new PlusOne().plusOne3(digits);
		for (int i: temp) {
			System.out.print(i+" ");
		}
	}

}
