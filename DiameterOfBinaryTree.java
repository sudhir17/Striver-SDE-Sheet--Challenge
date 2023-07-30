/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	 public static int height(TreeNode<Integer> root,int maxi[])
    {
        if(root==null)
            return 0;
        int lh=height(root.left,maxi);
        int rh=height(root.right,maxi);
        maxi[0]=Math.max(maxi[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        int max[]=new int[1];
        height(root,max);
        return max[0];
		// Write your code here.
	}
}
