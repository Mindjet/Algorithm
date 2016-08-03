package leetcode;

import java.util.Scanner;

/**
 * 该程序用来反转单词的元音字母
 * @author zyd
 *
 */

public class ReverseVowels {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		char[] mychar = s.toCharArray();
		int left = 0;
		int right = mychar.length-1;
		
		while (left<right) {
			
			 if(isVowel(s.charAt(left))&&isVowel(s.charAt(right))){
	                
	                char temp = mychar[left];
	                mychar[left] = mychar[right];
	                mychar[right] = temp;
	                
	                left++;
	                right--;
	                
	            }else if(isVowel(s.charAt(left))){
	                
	                right--;
	                
	            }else{
	                
	                left++;
	                
	            }
			
		}
		
		System.out.println(new String(mychar));
		

	}
	
	private static boolean isVowel(char c){
		
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
		
	}

}
