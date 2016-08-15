package leetcode;

import java.util.HashSet;

/**
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 */

public class Happy_Number {

	public static void main(String[] args) {

		System.out.println(isHappy(7));

	}

	private static boolean isHappy(int num) {

		HashSet<Integer> set = new HashSet<>();

		String s = String.valueOf(num);
		char c[] = s.toCharArray();
		int sum = 0;

		if (num == 1) {
			return true;
		} else {
			while (sum != 1) {

				sum = 0;
				for (int i = 0; i < c.length; i++) {
					sum += Math.pow(Integer.parseInt(c[i] + ""), 2);
				}

				if (sum == 1) {
					return true;
				}

				// if the HashSet contains the same digit, it means that it is
				// an endless loop.
				if (set.contains(sum)) {
					break;
				} else {
					set.add(sum);
				}

				c = String.valueOf(sum).toCharArray();

			}
		}

		return false;

	}

}
