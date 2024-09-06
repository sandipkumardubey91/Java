package com.demo.tree;

public class SymmetricTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(20);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		root.right.left = new Node(40);
		root.right.right = new Node(30);
		
		System.out.println("Tree is Symmetric : " + check(root, root));

	}

	private static boolean check(Node left, Node right) {
		if (left == null && right == null)
			return true;
		if (left == null || right == null)
			return false;
		if (left.val != right.val)
			return false;
		return check(left.left, right.right) && check(left.right, right.left);
	}

}
