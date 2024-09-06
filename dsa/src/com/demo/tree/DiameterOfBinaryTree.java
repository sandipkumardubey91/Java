package com.demo.tree;

public class DiameterOfBinaryTree {
	static int max = 0;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.right.right.left = new Node(1000);
		
		System.out.println(maxHeight(root));
		
	}
	public static int maxHeight(Node root) {
		if(root == null)
			return 0;
		int left = maxHeight(root.left);
		int right = maxHeight(root.right);
		max = Math.max(max, left + right);
		return 1 + Math.max(left, right);
	}

}
