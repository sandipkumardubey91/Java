package com.demo.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		System.out.println(levelOrderTraversal(root));
		ArrayList<Integer> ans = new ArrayList<Integer> ();
		ans = levelOrderTraversal(root);
		for (int a: ans)
		{
			System.out.print(a +" ");
		}
}

	private static ArrayList<Integer> levelOrderTraversal(Node root) {
		
		ArrayList<Integer> ans = new ArrayList<Integer> ();
		if(root == null)
			return ans;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node n = q.remove();
			ans.add(n.val);
			
			if(n.left!=null)
				q.add(n.left);
			if(n.right !=null)
				q.add(n.right);
		}
		return ans;
	}
}
