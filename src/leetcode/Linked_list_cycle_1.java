package leetcode;

import node.ListNode;

/**
 * to see if there is a cycle in a linked-list
 */

public class Linked_list_cycle_1 {

	public static void main(String[] args) {

		ListNode head = new ListNode(0);
		ListNode node3 = new ListNode(3, head);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		head.setNext(node1);

		System.out.println(hasCycle(head));

	}

	public static boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}

		}
		return false;
	}
}
