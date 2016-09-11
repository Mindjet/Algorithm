package leetcode;

/**
 * Write a function that takes an unsigned integer and returns the number of '1'
 * bits it has (also known as the Hamming weight).
 * 
 * For example, the 32-bit integer '11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 *
 */

public class Number_of_1_Bits {

	public static void main(String[] args) {

		System.out.println(hammingWeight_1(9));
		System.out.println(hammingWeight_2(2291381));
	}

	private static int hammingWeight_1(int n) {

		int result = 0;

		while (n != 0) {

			int temp = (int) (n & 1);
			result += temp;
			n = n >> 1;

		}

		return result;
	}

	// For example, if n=110100,n-1=110011,n&(n-1)=110000.
	// Then n=110000,n-1=101111,n&(n-1)=100000......

	private static int hammingWeight_2(int n) {

		int result = 0;

		while (n != 0) {

			n = n & (n - 1);
			result++;

		}

		return result;

	}

}
