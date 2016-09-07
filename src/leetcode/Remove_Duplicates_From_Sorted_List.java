package leetcode;

import node.ListNode;
import node.ListNode.ListNodeUtils;

public class Remove_Duplicates_From_Sorted_List {

	public static void main(String[] args) {

		int[] datas = { 1, 1, 2, 1, 2, 3 };
		ListNode head = ListNodeUtils.generateLinkedList(datas);
		ListNodeUtils.displayLinkedList(head);
		ListNodeUtils.displayLinkedList(deleteDuplicates(head));

	}

	private static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode reserved_head = head;

		while (head != null) {

			if (head.next.val == head.val) {

				if (head.next == null)
					break;
				else
					head.next = head.next.next;
			}

			head = head.next;

		}

		return reserved_head;
	}

}
