package com.demo.tree;

public class BinaryTreeMaximumPathSum {
	static int max = Integer.MIN_VALUE;
	public static int check(Node root) {
		if(root == null)
			return 0;
		int left = Math.max(0, check(root.left));
		int right = Math.max(0, check(root.right));
		
		max = Math.max(max, root.val + left + right);

		return root.val + Math.max(left, right);
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		root.right.right.right = new Node(70);
		root.right.right.left = new Node(70);
		
		check(root);
		System.out.println(max);

	}

}
