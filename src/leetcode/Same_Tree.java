package leetcode;

import node.TreeNode;

/**
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 *
 */

public class Same_Tree {

	public static void main(String[] args) {

		TreeNode root1 = new TreeNode(1);
		TreeNode root2 = new TreeNode(1);

		boolean isSame = isSameTree(root1, root2);
		System.out.println(isSame);

	}
	
	//Recursion
	public static boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}

		return p.val == q.val && isSameTree(p.left, q.left)
				&& isSameTree(p.right, q.right);

	}

}
