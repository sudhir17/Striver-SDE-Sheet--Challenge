/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class Solution {

    public static boolean func(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2)
    {
       
        if(root1==null || root2==null)
            return root1==root2;
        if(!root1.data.equals(root2.data))
            return false;
        boolean first=func(root1.left,root2.right);
        boolean second=func(root1.right,root2.left);
        return root1.data.equals(root2.data)&& first&& second;

    }
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        if(root==null)
            return true;
        // Write your code here.
        return func(root.left,root.right);

    }
}   
