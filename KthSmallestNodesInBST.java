import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/


public class Solution 
{
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

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		func(root,pq,k);
		if(pq.size()<k)
			return -1;
		return pq.poll();
		//  Write your code here.
	}

}
