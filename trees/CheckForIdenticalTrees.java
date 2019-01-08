/**
 * 
 */
package com.trees;

/**
 * @author Mahideep Tumati
 *
 *         Created on Jan 7, 2019 check if two trees are identical with respect
 *         to its data.
 */
public class CheckForIdenticalTrees {

	/**
	 * @param args
	 */
	static Node root1;
	static Node root2;

	public static void main(String[] args) {

		root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(-1);
		root1.left.left = new Node(5);
		root1.left.right = new Node(7);
		root1.right.left = new Node(-4);
		root1.right.right = new Node(6);
		root1.right.right.right = new Node(6);

		root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(-1);
		root2.left.left = new Node(5);
		root2.left.right = new Node(7);
		root2.right.left = new Node(-4);
		root2.right.right = new Node(6);
		root2.right.right.right = new Node(6);

		boolean treesIdentical = checkForIdenticalTrees(root1, root2);

		System.out.println("Provided tress are identical :: " + treesIdentical);

	}

	private static boolean checkForIdenticalTrees(Node root1, Node root2) {

		if (root1 == null && root2 == null)
			return true;

		if (root1.data == root2.data) {
			return checkForIdenticalTrees(root1.left, root2.left) && checkForIdenticalTrees(root1.right, root2.right);

		}

		return false;
	}

}
