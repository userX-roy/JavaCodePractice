/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]



*/
package com.array;

public class Array_LeetCodeProb1 {

	public int[] twoSum(int[] nums, int target) {

		int arr[] = new int[2];

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				int sum_indices = nums[i] + nums[j];

				if (target == sum_indices) {

					arr[0] = i;
					arr[1] = j;

					return (arr);
				}
			}
		}

		return (arr);

	}

	public static void main(String[] args) {

		Array_LeetCodeProb1 al1 = new Array_LeetCodeProb1();

		int nums[] = new int[] { 12, 23, 45, 65, 4, 2 };

		int target = 14;

		int arr[] = al1.twoSum(nums, target);

		System.out.println(arr[0] + "  " + arr[1]);
		
	}

}
