package node;

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(int val) {
		this.val = val;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public static class ListNodeUtils {

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
			
			System.out.print("|||");
			
		}

	}

}
