package com.demo.tree;

public class ValidateBST {
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.right.right.right = new Node(70);
		root.right.right.left = new Node(70);
		
		System.out.println(checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE));
	}
	
	public static boolean checkBST(Node root, long min, long max) {
		if(root == null)
			return true;
		if(root.val <= min || root.val >= max)
			return false;
		
		return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
	}
}
