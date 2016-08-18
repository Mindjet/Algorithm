package leetcode;

import node.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * 
 * Sparked by
 *         [http://fisherlei.blogspot.com/2013/11/leetcode-linked-list-cycle-ii-solution.html]
 */

public class Linked_list_cycle_2 {

	public static void main(String[] args) {

		ListNode head = new ListNode(0);
		ListNode node4 = new ListNode(4);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		node4.setNext(node2);
		head.setNext(node1);

		ListNode node = detectCycle(head);
		if (node != null) {
			System.out.println(node.val);
		}

	}

	private static ListNode detectCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		// to see if there is a cycle in the linked-list
		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next;

			// in case of list contain 1 element
			if (fast == null) {
				return null;
			} else {
				fast = fast.next;
			}

			if (slow == fast) {
				break;
			}

		}

		// if fast.next==null or fast == null, it means that both "fast" and
		// "slow" are at the end of the list,
		// which also means that there is no cycle in the list.
		if (fast == null || fast.next == null) {
			return null;
		}

		// the truth is that when the "fast" and "slow" meet, they can move the
		// the start of the cycle by a certain number of steps.
		// And the number of steps is the distance from the "head" to the start
		// of the cycle.
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;

	}

}
