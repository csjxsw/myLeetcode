package com._404;

public class SumofLeftLeaves {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	 
	public static void main(String args[]){
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(9);
		TreeNode right = new TreeNode(20);
		TreeNode left2 = new TreeNode(15);
		TreeNode right2 = new TreeNode(7);
		root.left = left;
		root.right = right;
		left.left = left2;
		left2.left = right2;
		
		int res = sumOfLeftLeaves(root);
		System.out.println(res);
	}
	
    public static int sumOfLeftLeaves(TreeNode root) {
    	if(root == null || (root.left==null && root.right==null)) return 0;
    	return helper(root);
    }

	private static int helper(TreeNode root) {
		int res =0;
		if(root.left != null && root.left.left==null && root.left.right ==null){
			res =  root.left.val;
		}
		int left=0 ,right=0;
		if(root.left!=null){
			left = helper(root.left);
		}
		if(root.right!=null){
			right = helper(root.right);
		}
		return res+left+right;
	}
}
