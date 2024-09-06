package com.demo.tree;

public class LowestCommonAncestor {

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
		
		Solution sol = new Solution();
		
		System.out.println( sol.lowestCommonAncestor(root, root.right.left , root.right.right.right).val);
}


}
class Solution{
	public Node lowestCommonAncestor(Node root, Node p,Node q) {
		if(root == null)
			return null;
		if(root == p || root == q)
			return root;
		Node left = lowestCommonAncestor(root.left, p , q);
		Node right = lowestCommonAncestor(root.right, p , q);
		
		if(left!=null && right !=null)
				return root;
		if(left != null)
			return left;
		else
			return right;
		
	}
}
