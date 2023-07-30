import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Tree node structure
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

************************************************************/

public class Solution {
	
	public static long func(TreeNode root, long max[])
	{
		if(root==null)
			return 0;
		long left=func(root.left,max);
		long right=func(root.right,max);
		max[0]= Math.max(max[0],root.data+left+right);
		return root.data+Math.max(left,right);
	}
	public static long findMaxSumPath(TreeNode root) {
		// Write your code here.
		 if(root==null)
            return -1;
        if(root.left==null && root.right==null)
            return -1;
        if(root.left==null &&root.right!=null)
        {
            if(root.right.left==null)
                return -1;
            if(root.right.right==null)
                return -1;
        }
         if(root.left!=null &&root.right==null)
        {
            if(root.left.left==null)
                return -1;
            if(root.left.right==null)
                return -1;
        }
		  long maxPath[]=new long[1];
        maxPath[0]=Integer.MIN_VALUE;
        func(root,maxPath);
        return maxPath[0];
	}
}
