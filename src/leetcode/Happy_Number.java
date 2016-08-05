package leetcode;

import java.util.HashSet;
import java.util.Hashtable;

public class Happy_Number {

	public static void main(String[] args) {
		
		System.out.println(isHappy(7));

	}
	
	private static boolean isHappy(int num) {
		
		HashSet<Integer> set = new HashSet<>();
		
		String s = String.valueOf(num);
		char c[] = s.toCharArray();
		int sum = 0;
		
		if (num==1) {
			return true;
		}else{
			while(sum!=1){
				
				sum = 0;
				for (int i = 0; i < c.length; i++) {
					sum+=Math.pow(Integer.parseInt(c[i]+""), 2);
				}
				
				if (sum==1) {
					return true;
				}
				
				// if the HashSet contains the same digit, it means that it is an endless loop.
				if (set.contains(sum)) {
					break;
				}else{
					set.add(sum);
				}
				
				c = String.valueOf(sum).toCharArray();
				
			}
		}
		
		return false;
		
	}
	

}
