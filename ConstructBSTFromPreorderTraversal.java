import java.util.* ;

//import javax.swing.tree.TreeNode;

import java.io.*; 
 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {
	public static void func(TreeNode<Integer> root,int x)
	{
		if(root==null)
			return;

		if(root.data>x)
		{
			if(root.left==null)
			{
				root.left=new TreeNode(x);
				return;
			}
			func(root.left,x);
		}
		else if(root.data<x) {
			
			if(root.right==null)
			{
				root.right=new TreeNode(x);
				return;
			}
			func(root.right,x);
		}
		else 
			return;
	}
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		// Write your code here
		 TreeNode<Integer> root=new TreeNode<>(preOrder[0]);
		 for(int i=0;i<preOrder.length;i++)
		 {
			 func(root,preOrder[i]);
		 }
		 return root;
	}

}
