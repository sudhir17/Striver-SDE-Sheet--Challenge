import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

    public static int func(BinaryTreeNode root)
    {
        if(root==null)
            return 0;
        int left=func(root.left);
        int right=func(root.right);
        if(left==-1 || right==-1)
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return 1+Math.max(left,right);
    }
	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		if(func(root)==-1)
            return false;
        return true;

	}
}
