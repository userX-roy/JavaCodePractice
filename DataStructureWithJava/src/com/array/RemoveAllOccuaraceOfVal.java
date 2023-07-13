//A array and one number given remove all the occurance of the array and re-build the
//array without that number and return number of element on that new array 



package com.array;

public class RemoveAllOccuaraceOfVal {

	private static int nums [] = new int[] {1,2,5,2,2,6,2,2,4};
	
	
	public int removeElement(int[] nums, int val) {
		
		int j=0;
		int temp[] = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]!=val) {
				temp[j]=nums[i];
				++j;
			}
			
		}
		
		for (int k = 0; k < temp.length; k++) {
			nums[k]=temp[k];
		}
		
		return (j);
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("\n"+new RemoveAllOccuaraceOfVal().removeElement(nums, 2)+"\n");
	
		for (int i : nums) {
			System.out.println(i+" ");
		}
	
	}

}
