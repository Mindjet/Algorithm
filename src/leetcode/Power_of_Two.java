package leetcode;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 */

public class Power_of_Two {

	public static void main(String[] args) {
		
		System.out.println(isPowerOfTwo_1(2));
		System.out.println(isPowerOfTwo_2(256));

	}
	
	private static boolean isPowerOfTwo_1(int n) {
		
		if (n<=0) {
			return false;
		}
		
		int count = 0;
		while (n!=0) {
			
			if((n&1)==1){
				count++;
			}
			
			n = n>>1;
		}
		
		return count==1;
	}
	
	private static boolean isPowerOfTwo_2(int n) {
		
		
		//If n is a power of 2, its top bit must be 1 and the other bits must be 0.
		//If n minus 1, its top bit must be 0 and the other bits must be 1.
		//By using AND operation, the result must be 0.
		
		return (n>0&&(n&n-1)==0);
		
	}

}
