package leetcode;

public class Ugly_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static boolean isUgly(int n) {
		
		
		if (n==1) {
			return true;
		}
		
		while (isPrime(n)) {
			
			
			
		}
		
		
		
		return true;
	}
	
	private static boolean isPrime(int num){
		
		if (num%2==0||num%3==0||num%5==0) {
			return true;
		}
		
		return false;
		
	}

}
