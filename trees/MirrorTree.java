/**
 * 
 */
package com.trees;

/**
 * @author Mahideep Tumati
 *
 *         Created on Jan 7, 2019
 * 
 *         Convert a tree into its mirror tree
 */
public class MirrorTree {

	static Node root;

	public static void main(String[] args) {

		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(-4);
		root.right.right = new Node(6);
		root.right.right.right = new Node(6);
		inOrderTraversal(root);

		root = mirrorTree(root);
		System.out.println(" ");
		System.out.println("Inorder after mirror"); // here InOrder is tested before and after to check if it got a mirror image
		inOrderTraversal(root);

	}

	private static void inOrderTraversal(Node root) {

		if (root.left != null)
			inOrderTraversal(root.left);

		System.out.print(root.data + " ");

		if (root.right != null)
			inOrderTraversal(root.right);
	}

	private static Node mirrorTree(Node root) {

		if (root== null)
			return root;

			Node prev = mirrorTree(root.left);

			Node next = mirrorTree(root.right);

		root.right = prev;
		root.left = next;

		return root;

	}

}
