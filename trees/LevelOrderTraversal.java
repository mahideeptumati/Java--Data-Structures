/**
 * 
 */
package com.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Mahideep Tumati
 *
 *         Created on Jan 7, 2019
 * 
 *         Level order traversal of a binary tree.. Printing level by level
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
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

		levelOrderTraversal(root);

	}

	private static Node levelOrderTraversal(Node root) {

		if (root == null)
			return root;

		Queue<Node> queue = new LinkedList<>(); // using queue for this

		if (root != null)
			queue.add(root);

		while (!queue.isEmpty()) {

			Node front = queue.remove();
			System.out.print(front.data + " ");

			if (front.left != null)
				queue.add(front.left);
			if (front.right != null)
				queue.add(front.right);

		}

		return null;
	}

}
