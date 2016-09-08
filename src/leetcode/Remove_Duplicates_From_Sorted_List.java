package leetcode;

import node.ListNode;
import node.ListNodeUtils;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 */

public class Remove_Duplicates_From_Sorted_List {

	public static void main(String[] args) {

		int[] datas = { 1, 1, 1, 2, 2, 3, 3, 1, 1 };
		ListNode head = ListNodeUtils.generateLinkedList(datas);
		ListNodeUtils.displayLinkedList(head);
		ListNodeUtils.displayLinkedList(deleteDuplicates(head));

	}

	private static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode pre = head;
		ListNode rear = head.next;

		while (rear != null) {
			
			//If the pre's value equals to the rear's value,
			//let the pre'next be the rear's next and do not move the pre. 
			if (pre.val == rear.val)	
				pre.next = rear.next;
			
			//If the pre's value is not the same as the its next value, move the pre to the next.
			else if (pre.val != pre.next.val)
				pre = pre.next;

			if (rear.next == null)
				break;
			else
				rear = rear.next;

		}

		return head;
	}

}
