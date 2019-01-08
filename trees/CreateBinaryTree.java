/**
 * 
 */
package com.trees;

/**
 * @author Mahideep Tumati
 *
 *         Created on Dec 28, 2018
 */


public class CreateBinaryTree {

	static Node root;

	public static void main(String[] args) {

		root = new Node(5);

		root.left = new Node(3);

		root.right = new Node(10);

		
		System.out.println("------PreOrder------");


		preOrder(root);
		
		System.out.println("------In Order------");

		
		inorder(root);

		System.out.println("------Post Order------");

		
		postOrder(root);

	}

	/**
	 * @param root2
	 */
	private static void postOrder(Node root) {

		
		if (root != null) {

			if (root.left != null)
				postOrder(root.left);
			if (root.right != null)
				postOrder(root.right);

			System.out.println(root.data);

		}

	}

	/**
	 * @param root
	 */
	private static void preOrder(Node root) {

		
		if (root != null) {

			System.out.println(root.data);
			if (root.left != null)
				preOrder(root.left);
			if (root.right != null)
				preOrder(root.right);
		}

	}

	/**
	 * @param root
	 */
	private static void inorder(Node root) {
		


		if (root != null) {
			if (root.left != null)
				inorder(root.left);
			System.out.println(root.data);
			if (root.right != null)
				inorder(root.right);
		}

	}

}
