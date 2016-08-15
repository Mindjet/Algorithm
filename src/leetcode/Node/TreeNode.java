package leetcode.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		super();
		this.val = val;
	}
	
	//print the tree using the BFS (breadth-first searching algorithm)
	public static void print(TreeNode root) {

		Queue queue = new Queue();
		queue.enqueue(root);

		TreeNode current = queue.dequeue();
		while (current != null) {

			System.out.print(current.val + " ");

			if (current.left != null) {
				queue.enqueue(current.left);
			}

			if (current.right != null) {
				queue.enqueue(current.right);
			}

			current = queue.dequeue();

		}

	}

	static class Queue {

		public List<TreeNode> nodes;
		public int top = 0;

		public Queue() {
			nodes = new ArrayList<TreeNode>();
		}

		public void enqueue(TreeNode node) {
			nodes.add(node);
		}

		public TreeNode dequeue() {
			if (top == nodes.size())
				return null;
			return nodes.get(top++);
		}

	}

}
