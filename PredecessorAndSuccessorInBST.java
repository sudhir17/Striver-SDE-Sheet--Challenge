import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// Write your code here.
		ArrayList<Integer> list=new ArrayList<>();
		int suc=-1,pre=-1;
		BinaryTreeNode<Integer> temp=root;
		while(root!=null)
		{
			if(root.data<=key)
			{
				root=root.right;
			}
			else {
				suc=root.data;
				root=root.left;
			}
		}
		while(temp!=null)
		{
			if(temp.data<key)
			{
				pre=temp.data;
				temp=temp.right;
			}
			else 
			 temp=temp.left;
		}
		list.add(pre);
		list.add(suc);
		return list;

	}
}
