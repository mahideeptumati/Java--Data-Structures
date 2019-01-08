/**
 * 
 */
package com.trees;

/**
 * @author Mahideep Tumati
 *
 *         Created on Jan 7, 2019
 */
public class SizeOfBinaryTree {

	/**
	 * @param args
	 */
	static Node root;

	public static void main(String[] args) {

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(-1);
		root.left.left = new Node(5);
		root.left.right = new Node(7);
		root.right.left = new Node(-4);
		root.right.right = new Node(6);
		root.right.right.right = new Node(6);

		int size = getSizeOfTree(root);

		System.out.println("No: of nodes in the given binary tree is :: " + size);
	}

	private static int getSizeOfTree(Node root) {

		if (root == null)
			return 0;

		if (root.left == null && root.right == null)
			return 1;

		int sizeOfLeftTree = 0;
		int sizeOfRightTree = 0;

		if (root.left != null)
			sizeOfLeftTree = getSizeOfTree(root.left);

		if (root.right != null)
			sizeOfRightTree = getSizeOfTree(root.right);

		return 1 + sizeOfLeftTree + sizeOfRightTree;
	}

}
