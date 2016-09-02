package leetcode;


/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 */

public class Single_Number {

	public static void main(String[] args) {
		
		int nums[] = {1,2,2,13,1};
		System.out.println(singleNumber(nums));

	}
	
	/**
	 *	As the O(n) time complexity and the O(1) space complexity are required, 
	 *  we are supposed to use one loop without nested loop, and the varaibles we create must be limited.
	 */
	
	public static int singleNumber(int []nums){
		
		if(nums.length==0||nums==null){
			
			return 0;
			
		}
		
		//Note that if a==b,then a^b==0. for example, a=1001 and b=1001, then a^b=0000.
		//And a^b=b^a, it means that we can make zero when there are numbers that appear twice.
		//Finally, note that 0^a=a, we can get the single number by XORing all elements.
		
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			
			result = result^nums[i];
			
		}
		
		return result;
		
	}

}
