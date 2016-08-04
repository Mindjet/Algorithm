package leetcode;


/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Example:
 * 	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 	Output: 7 -> 0 -> 8
 *
 */

public class Add_2_Numbers {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(4);
		ListNode l1_2 = new ListNode(0);
		ListNode l2_2 = new ListNode(9);
		ListNode l1_3 = new ListNode(5);
		ListNode l2_3 = new ListNode(5);
		
		l1.next = l1_2;
		l1_2.next = l1_3;
		l2.next = l2_2;
		l2_2.next = l2_3;
		
		ListNode head = addTwoNumbers(l1, l2);
		while (head!=null) {
			
			if (head.next==null) {
				System.out.print(head.val);
			}else{
				System.out.print(head.val+"--> ");
			}
			head = head.next;
			
		}

	}
	
	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode th = new ListNode(0);
        int carry = 0;
        
        ListNode my = new ListNode(0);
        ListNode head = my;
        
        while(l1!=null||l2!=null){
            
            if(l1==null){
                 my.val = l2.val+carry;
                 l2 = l2.next;
            }else if(l2==null){
                my.val = l1.val + carry;
                l1 = l1.next;
            }else{
                 my.val = l1.val+l2.val+carry;
                 l1 = l1.next;
                 l2 = l2.next;
            }
            
            if(my.val>=10){
                my.val -= 10;
                carry = 1;
            }else{
                carry = 0;
            }
            
            if(l1==null&&l2==null){
            	
            	//if carry==1 and both l1 and l2 reach the end, then we should attach a new node to the end.
                if(carry==1){	
                    th.val = 1;
                    my.next = th;
                }
                break;
            }else {
                my.next = new ListNode(0);
                my = my.next;
            }
            
        }
        
        return head;
        
    }
	
	static class ListNode{
		
		public int val;
		public ListNode next;
		
		public ListNode(int val){
			this.val = val;
		}
		
	}

}
