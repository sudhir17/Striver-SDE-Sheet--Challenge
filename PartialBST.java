import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
  public static boolean func(BinaryTreeNode<Integer> root,long min,long max)
    {
        if(root==null)
            return true;
        if(root.data>max || root.data<min)
            return false;
        boolean left=func(root.left,min,root.data);
        boolean right=func(root.right,root.data,max);
        return left&&right;
    }
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        return func(root,Long.MIN_VALUE,Long.MAX_VALUE);

        // Write your code here
    }
}
