package leetcode;

import leetcode.Node.TreeNode;

/**
 * Given a binary tree, find its maximum depth. The maximum depth is the number
 * of nodes along the longest path from the root node down to the farthest leaf
 * node.
 */

public class Max_Depth_of_Binary_Tree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode();

		System.out.println(maxDepth(root));

	}

	// Here I adopt the DF algorithm
	private static int maxDepth(TreeNode node) {

		if (node == null) {
			return 0;
		}

		int depth_l = maxDepth(node.left);
		int depth_r = maxDepth(node.right);

		return depth_l > depth_r ? depth_l + 1 : depth_r + 1;

	}

}
