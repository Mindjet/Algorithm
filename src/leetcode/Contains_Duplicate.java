package leetcode;

import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 *
 */

public class Contains_Duplicate {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 3 };
		System.out.println(containsDuplicate(nums));

	}

	private static boolean containsDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {

			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}

		}

		return false;
	}

}
