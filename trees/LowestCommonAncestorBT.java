/**
 * 
 */
package com.trees;

/**
 * @author Mahideep Tumati
 *
 * Created on Jan 7, 2019
 */
public class LowestCommonAncestorBT {

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
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        
        int i=2,j=4;
        
        Node lcaBinaryTree=lowestCommonAncestorBinaryTree(root,i,j);
		
        
        System.out.println("Lowest Common Ancestor of a Binary Tree :: "+lcaBinaryTree.data);
        
	}
	
	
	
	
	private static Node lowestCommonAncestorBinaryTree(Node root, int i, int j) {

		if(root==null)
			return root;
		
		if(root.data==i || root.data==j)
			return root;
		
		Node left=null;
		
		if(root.left!=null)
			 left=lowestCommonAncestorBinaryTree(root.left,i,j);
		
		Node right=null;
		if(root.right!=null)
			right= lowestCommonAncestorBinaryTree(root.right,i,j);
		
		if(left==null && right==null)
			return null;
		else 
			return root;
	}

}
