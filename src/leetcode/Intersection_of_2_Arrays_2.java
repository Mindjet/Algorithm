package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 *
 */

public class Intersection_of_2_Arrays_2 {

	public static void main(String[] args) {
		
		int nums1[] = {1,1,2,2};
		int nums2[] = {2,2};
		
		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();
		HashSet<Integer> indexs = new HashSet<>();

		if (nums1.length < nums2.length) {

			for (int i = 0; i < nums1.length; i++) {

				for (int j = 0; j < nums2.length; j++) {

					if (nums1[i] == nums2[j]&&!indexs.contains(j)) {
						list.add(nums1[i]);
						indexs.add(j);
						break;
					}

				}

			}

		} else {

			for (int i = 0; i < nums2.length; i++) {

				for (int j = 0; j < nums1.length; j++) {

					if (nums2[i] == nums1[j]&&!indexs.contains(j)) {
						list.add(nums2[i]);
						indexs.add(j);
						break;
					}

				}

			}

		}
		
		int[] result = new int[list.size()];
		int count=0;
		for (int i : list) {
			result[count++]=i;
		}

		return result;

	}

}
