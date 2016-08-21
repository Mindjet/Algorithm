package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than [n/2] times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 *
 */

public class Majority_Element {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3 };

		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			Integer count = map.get(nums[i]);
			if (count == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], count + 1);
			}

		}

		double len = nums.length;
		double half = Math.ceil(len / 2);

		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			int value = (int) entry.getValue();
			if (value >= Math.ceil(half)) {
				return (int) entry.getKey();
			}
		}

		return -1;
	}

}
