//Given a sorted array of distinct integers and a target value, 
//return the index if the target is found. If not, 
//return the index where it would be if it were inserted in order.


package com.array;

public class SearchInsertPosition {

	static int nums[] = new int[] {1,3,4,5,7};
	
	public int searchInsert(int[] nums, int target) {
		
		int k=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==target) {
				k=i;
				break;
			}
			else {
				if(nums[i]>target) { //here we are checking if the i-th element is biger than target element , if yes then target element must be at that position to maintain order
					k=i;
					break;
				}
				else {
					k=i+1; // if no biger element found than target element , then target element must be the bigest one , hence it position will be at the {array length + 1}-th position
				}
			}
		}
		return k;
	}

	public static void main(String[] args) {
		System.out.println(new SearchInsertPosition().searchInsert(nums, 7));
	}

}
