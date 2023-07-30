import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

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
	public static void func(TreeNode<Integer> root, PriorityQueue<Integer> pq,int k)
	{
		if(root==null)
			return;
		func(root.left,pq,k);
		pq.add(root.data);
		if(pq.size()>k)
			pq.poll();
		func(root.right,pq,k);
	}
	public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		func(root,pq,k);
		if(pq.size()<k)
			return -1;
		return pq.poll();
	}
}
