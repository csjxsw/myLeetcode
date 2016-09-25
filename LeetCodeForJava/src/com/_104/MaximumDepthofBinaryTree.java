package com._104;

public class MaximumDepthofBinaryTree {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	 
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode left2 = new TreeNode(4);
		TreeNode right2 = new TreeNode(5);
		root.left = left;
		root.right = right;
		left.left = left2;
		left2.left = right2;
		
		int res = maxDepth(root);
		System.out.println(res);
	}
	
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftDep = maxDepth(root.left)+1;
        int rightDep = maxDepth(root.right)+1;
        return leftDep>rightDep?leftDep:rightDep;
    }
}
