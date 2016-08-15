package leetcode;

import java.util.Scanner;

/**
 * Example 1: Given s = "hello", return "holle".
 * 
 * Example 2: Given s = "leetcode", return "leotcede".
 * 
 * Note: The vowels does not include the letter "y".
 */

public class ReverseVowels {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();

		char[] mychar = s.toCharArray();
		int left = 0;
		int right = mychar.length - 1;

		while (left < right) {

			if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {

				char temp = mychar[left];
				mychar[left] = mychar[right];
				mychar[right] = temp;

				left++;
				right--;

			} else if (isVowel(s.charAt(left))) {

				right--;

			} else {

				left++;

			}

		}

		System.out.println(new String(mychar));
		scanner.close();

	}

	private static boolean isVowel(char c) {

		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

	}

}
