package leetcode;

import java.util.ArrayList;
import java.util.List;
import node.ListNode;

/**
 * Reverse a singly linked list.
 */

public class Reverse_Linked_List {

	public static void main(String[] args) {
		
		ListNode node0 = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		ListNode head = reverseList(node0);
		
	}

	public static ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		List<ListNode> list = new ArrayList<>();

		while (head != null) {
			list.add(head);
			head = head.next;
		}

		for (int i = list.size() - 1; i > 0; i--) {

			System.out.println(list.get(i).val+"->"+list.get(i-1).val);
			list.get(i).next = list.get(i - 1);

		}
		
		list.get(0).next = null;

		return list.get(list.size() - 1);

	}

}
