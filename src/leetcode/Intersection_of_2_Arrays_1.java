package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_2_Arrays_1 {

	public static void main(String[] args) {
		
		int nums1[] = {1,1,2,2};
		int nums2[] = {2,2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> interSet = new HashSet<>();
		
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				interSet.add(nums2[i]);
			}
		}
		
		int[] result = new int[interSet.size()];
		int count=0;
		for (int i : interSet) {
			result[count++] = i;
		}
		
		
		return result;

	}

}
