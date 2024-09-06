package com.demo.tree;



public class LevelOrderTraversalRecc {
	public static boolean printRoot(Node root, int level) {
		if (root == null)
			return false;
		if(level == 1) {
			System.out.print(root.val +" ");
			return true;
		}
		boolean left  = printRoot( root.left, level - 1);
		boolean right = printRoot( root.right, level - 1);
		
		return left || right;
	}
	public static void levelOrderTraversalr(Node root) {
		int level = 1;
		while(printRoot( root, level))
			level++;
		
	}
	public static void main(String[] args) {
		System.out.println();
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		levelOrderTraversalr(root);
	}

}
