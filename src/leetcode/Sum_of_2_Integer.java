package leetcode;

public class Sum_of_2_Integer {

	public static void main(String[] args) {

		System.out.println(getSum(3, 4));
		
	}

	private static int getSum(int a, int b){
		
		while(b!=0){
			
			//calculate the carry
			int carry = a&b;
			
			//calculate the sum without considering the carry
			a = a^b;
			
			//carry left shift
			b = carry<<1;
			
		}
		
		return a;
		
	}
	
}
