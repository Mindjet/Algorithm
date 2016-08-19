package leetcode;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 */

public class Remove_Element {

	public static void main(String[] args) {

		int nums[] = { 2 };
		int val = 2;

		System.out.println(Arrays.toString(nums));
		int length = removeElement(nums, val);

		for (int i = 0; i < length - 1; i++) {
			System.out.print(nums[i] + " ");
		}

	}

	public static int removeElement(int[] nums, int val) {

		int head = 0;
		int rear = nums.length - 1;
		int count = nums.length;

		if (count == 1 && nums[0] == val) {
			return 0;
		}

		while (head < rear) {

			if (nums[head] == val) {
				nums[head] = nums[rear];
				rear--;
				count--;
				continue;
			} else {
				head++;
			}

		}

		return count;

	}

}
