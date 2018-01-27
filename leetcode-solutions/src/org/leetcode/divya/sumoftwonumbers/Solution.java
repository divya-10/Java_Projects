package org.leetcode.divya.sumoftwonumbers;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == nums[i] + nums[j])
					return new int[] { i, j };
			}
		}
		int x[] = { -1, -1 };
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 2, 3, 4, 7 };
		int target = 14;
		int[] result = twoSum(nums, target);
		System.out.println("identified indices are" + result[0] + "," + result[1]);

	}

}
