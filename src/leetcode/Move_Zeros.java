package leetcode;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements. For example, given
 * nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3,
 * 12, 0, 0].
 * 
 */

public class Move_Zeros {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 2, 3, 0, 12, 3, 45, 0 };
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(moveZeroes(nums)));

	}

	public static int[] moveZeroes(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length - count; i++) {

			// When the nums[i]==0, let the nums[i] jump out of the arrays,
			// and the other elements move forwards.
			if (nums[i] == 0) {
				nums = moveForwards(nums, i);
				count++;
				i--;
			}

		}

		return nums;

	}

	private static int[] moveForwards(int[] nums, int i) {

		int temp = nums[i];

		for (int j = i; j < nums.length - 1; j++) {

			nums[j] = nums[j + 1];

		}

		nums[nums.length - 1] = temp;

		return nums;

	}

}
