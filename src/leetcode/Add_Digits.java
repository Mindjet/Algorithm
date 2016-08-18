package leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * 
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

public class Add_Digits {

	public static void main(String[] args) {

		System.out.println(addDigits(199));

	}

	private static int addDigits(int num) {

		// Method 1
		// String s = String.valueOf(num);
		// char c[] = s.toCharArray();
		// int sum = 0;
		//
		// while(c.length>1){
		//
		// sum = 0;
		// for (int i = 0; i < c.length; i++) {
		// sum+=Integer.parseInt(c[i]+"");
		// }
		//
		// c = String.valueOf(sum).toCharArray();
		//
		// }
		//
		// return sum;

		/**
		 * Method 2 Time Complexity = O(1) we can see the regular pattern is:
		 * num: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21... ret:
		 * 0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3....
		 * 
		 * I must say that it is freaking brilliant;
		 * 
		 */

		return (num - 1) % 9 + 1;

	}

}
