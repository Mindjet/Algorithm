package leetcode;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * 
 * For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 *
 */

public class Excel_Sheet_Column_Title {

	public static void main(String[] args) {

		System.out.println(convertToTitle(552));

	}
	
	// Technically, it is a problem aiming to transfer a number in decimal 
	// to another number in 26 binary system.
	//
	// As this 26 binary system begins at 1 but not 0, 
	// we should minus 1 before calculation.
	public static String convertToTitle(int n) {

		StringBuilder result = new StringBuilder("");

		while(n!=0){
			
			char c = (char) ((n-1)%26+'A');
			result.insert(0, c);
			n = (n-1)/26;
			
		}
		
		return result.toString();
	}

}
