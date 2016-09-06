package leetcode;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * Follow up: Could you do it without using any loop / recursion?
 *
 */

public class Power_of_Three {

	public static void main(String[] args) {

		System.out.println(isPowerOfThree_1(9));
		System.out.println(isPowerOfThree_2(27));
		System.out.println(isPowerOfThree_3(3));

	}

	// Method1, O(n)
	private static boolean isPowerOfThree_1(int n) {

		for (int i = 0; i <= 19; i++) {

			if (Math.pow(3, i) == n) {
				return true;
			} else if (n < Math.pow(3, i)) {
				return false;
			}

		}

		return false;

	}

	// Method2, O(1)
	private static boolean isPowerOfThree_2(int n) {

		// As an integer is less than 2^31-1, the biggest power of 3 is 3^19 = 1162261467.
		return (n > 0 && 1162261467 % n == 0);

	}

	// Method3, O(1)
	private static boolean isPowerOfThree_3(int n) {

		// We know that if log(n,3) equals to an integer, then n is a power of 3.
		double result = Math.log10(n) / Math.log10(3);
		return (n > 0 && result - (int) result == 0);

	}

}
