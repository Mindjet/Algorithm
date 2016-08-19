package leetcode;

import java.util.Arrays;

/**
 * Given a non negative integer number num. 
 * For every numbers i in the range 0 <= i <= num calculate the number of 1's in their binary representation and return
 * them as an array.
 * 
 * Example: For num = 5 you should return [0,1,1,2,1,2].
 *
 */

public class Counting_Bits {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(countBits_1(10)));
		System.out.println(Arrays.toString(countBits_2(10)));

	}
	
	/*
	 * 0000	0
	 * 0001	1
	 * 0010	1
	 * 0011	2
	 * 0100	1
	 * 0101	2
	 * 0110	2
	 * 0111	3
	 * 
	 * 
	 * 1000	1
	 * 1001	2
	 * 1010	2
	 * 1011	3
	 * 1100	2
	 * 1101	3
	 * 1110	3
	 * 1111	4
	 * 
	 * 10000	1
	 * 10001	2
	 * 10010	2
	 * 10011	3
	 * ...
	 */

	// Method 1
	// O(n)
	public static int[] countBits_1(int num) {

		int[] result = new int[num + 1];
		result[0] = 0;

		for (int i = 0; i < result.length; i++) {

			if (i % 2 == 0)
				result[i] = result[i / 2];
			else
				result[i] = result[i / 2] + 1;

		}

		return result;
	}

	// Method 2
	// O(n*sizeof(num))
	public static int[] countBits_2(int num) {

		int[] result = new int[num + 1];
		for (int i = 0; i <= num; i++) {

			result[i] = count(i);

		}

		return result;

	}

	private static int count(int num) {

		int count = 0;
		while (num > 0) {

			// if the num&1==1, it means that the last bit is 1;
			if ((num & 1) == 1) {
				count++;
			}

			// right shift
			num = num >> 1;
		}
		return count;
	}

}
