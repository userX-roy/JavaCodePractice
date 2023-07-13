//Removing Duplicate Element from an Array


package com.array;


public class RemoveDuplicateElement_FrmSortedArray {

	static int nums[] = new int[] {1,2,2,2,3,5,5,6,7,7,9,9};

	public int removeDuplicates(int[] nums) {
		
		int j=1;
		
		int temp[] = new int[nums.length];
		
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i]!=nums[i-1]) {
				temp[j]=nums[i];
				j++;
			}
		}
		
		temp[0]=nums[0];
		
		System.out.println("After Removing Duplicate element , total element remain :"+j);
		
		for (int i = 0; i < temp.length; i++) {
			
			nums[i]=temp[i];
		}
		
		return j;
	}
	
    
//	public int removeDuplicates2(int[] arr) {
//		int j=1; // flag variable
//		
//		/*If the control sees element is same , it will increase i but not j 
//		j will be stay locked untill i index position found element is same with j
//		as soon as i & j becomes different i index vale swap to j index and j incremented
//		*/
//		
//		for (int i = 1; i < arr.length; i++) {    //Shortest way
//			if(arr[i]!=arr[i-1]) { 
//				arr[j]=arr[i];
//				j++;
//			}
//			
//		}
//		
//		return j;
//	}
	
	
	public static void main(String[] args) {

		//System.out.println(inputArray.length);
		
		
		new RemoveDuplicateElement_FrmSortedArray().removeDuplicates(nums);
		
	
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

}
