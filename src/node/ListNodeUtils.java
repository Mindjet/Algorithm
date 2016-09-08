package node;

public class ListNodeUtils {

	public static ListNode generateLinkedList(int[] datas) {

		ListNode pre = null;
		ListNode current = null;
		
		for (int i = datas.length - 1; i >= 0; i--) {
			
			current = new ListNode(datas[i]);
			current.next = pre;
			pre = current; 

		}

		return current;
	}
	
	public static void displayLinkedList(ListNode head) {
		
		System.out.print("|||->");
		
		while (head!=null) {
			
			System.out.print(head.val+"->");
			head = head.next;
			
		}
		
		System.out.println("|||");
		
	}
	
}
