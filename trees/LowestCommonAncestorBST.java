/**
 * 
 */
package com.trees;

/**
 * @author Mahideep Tumati
 *
 *         Created on Jan 7, 2019
 *         Lowest Common ancestor of a Binary search tree
 *         
 */
public class LowestCommonAncestorBST {

	
	static Node root;
	public static void main(String[] args) {

		
		 	root = new Node(20); 
	        root.left = new Node(8); 
	        root.right = new Node(22); 
	        root.left.left = new Node(4); 
	        root.left.right = new Node(12); 
	        root.left.right.left = new Node(10); 
	        root.left.right.right = new Node(14);
	        
	       Node ancestor= lowestCommonAncestor(root,10,22);
		
	       System.out.println("Lowest common ancestor of the BST is :: "+ancestor.data);
	}
	
	private static Node lowestCommonAncestor(Node root, int i, int j) {

		if (root == null)
			return root;

		if ((i < root.data && j < root.data) && root.left != null)
			return lowestCommonAncestor(root.left, i, j);

		if ((root.data < i && root.data < j) && root.right != null)
			return lowestCommonAncestor(root.right, i, j);

		return root;

	}

}
