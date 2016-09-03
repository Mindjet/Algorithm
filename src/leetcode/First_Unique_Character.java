package leetcode;

import java.util.HashSet;

/**
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 *
 */

public class First_Unique_Character {

	public static void main(String[] args) {

		System.out.println(firstUniqChar("leetcode"));

	}

	
	private static int firstUniqChar(String s) {

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {

			//if the character has appeared, there is no need to go further
			if (set.contains(s.charAt(i)))
				continue;
			else
				set.add(s.charAt(i));

			int j;

			for (j = 0; j < s.length(); j++) {

				if (j != i && s.charAt(j) == s.charAt(i)) {
					break;
				}

			}

			if (j == s.length()) {
				return i;
			}

		}

		return -1;
	}

}
