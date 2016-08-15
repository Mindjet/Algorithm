package leetcode;

import leetcode.Node.TreeNode;

/**
 * Invert a binary tree.
 * 
 * 4 / \ 2 7 / \ / \ 1 3 6 9
 * 
 * to
 * 
 * 4 / \ 7 2 / \ / \ 9 6 3 1
 * 
 * 
 */

public class Invert_Binary_Tree {

	public static void main(String[] args) {

		// generate a tree
		TreeNode root = new TreeNode(4);
		TreeNode child1 = new TreeNode(2);
		TreeNode child2 = new TreeNode(7);
		TreeNode child3 = new TreeNode(1);
		TreeNode child4 = new TreeNode(3);
		TreeNode child5 = new TreeNode(6);
		TreeNode child6 = new TreeNode(9);

		// connect the nodes
		root.left = child1;
		root.right = child2;
		child1.left = child3;
		child1.right = child4;
		child2.left = child5;
		child2.right = child6;

		// print the tree beforehand
		TreeNode.print(root);
		System.out.println("");

		// print the tree afterwards
		reverse(root);
		TreeNode.print(root);

	}

	private static void reverse(TreeNode root) {

		// pretty simple recursion
		if (root != null) {

			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;

			reverse(root.left);
			reverse(root.right);

		}

	}

}
