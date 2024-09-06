package com.demo.tree;

import java.util.Scanner;

public class SearchInBST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the number of node: ");
		int n = sc.nextInt();
		System.out.print("\nEnter the value of First node: ");
		int fval = sc.nextInt();
		Node root = new Node(fval);
		for(int i=1; i<n; i++) {
			
			System.out.print("\nEnter the value of node: ");
			int val = sc.nextInt();
			insertIntoBst(root, val );
		}
		inorder(root);
		System.out.print("\n Enter the Key want to search: ");
		int key = sc.nextInt();
		if(searchInBST(root, key)!=null) {
			System.out.print("\n Found.");
		}
		else {
			System.out.print("\n Not Found.");
		}

	}
	
	public static Node insertIntoBst(Node root, int val) {
		if(root == null) {
			Node node = new Node(val);
			return node;
		}
		if(val < root.val)
			root.left = insertIntoBst(root.left, val);
		else
			root.right = insertIntoBst(root.right, val);
		return root;
	}
	
	public static void inorder(Node root) {
		if(root== null)
			return;
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
	
	public static Node searchInBST(Node root, int key) {
		if (root == null)
			return null;
		if(root.val == key)
			return root;
		if(key <root.val)
			return searchInBST(root.left, key);
		else
			return searchInBST(root.right, key);
	}

}
