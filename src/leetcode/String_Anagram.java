package leetcode;

import java.util.Arrays;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * 
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 */

public class String_Anagram {

	public static void main(String[] args) {
		
		
		System.out.println(isAnagram("",""));
		

	}

	public static boolean isAnagram(String s, String t) {

		if(s==null&&t==null) return true;
		
		if (s.length()!=t.length()) {
			return false;
		}
		
		char[] sequence_s = s.toCharArray();
		char[] sequence_t = t.toCharArray();
		
		Arrays.sort(sequence_s);
		Arrays.sort(sequence_t);
		
		
		return Arrays.equals(sequence_s, sequence_t);
		
	}

}
