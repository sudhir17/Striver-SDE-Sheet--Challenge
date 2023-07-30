import java.util.* ;
import java.io.*; 
/*

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

*/

public class Solution 
{   
    public static TreeNode<Integer> func(TreeNode<Integer> root,TreeNode<Integer> p,TreeNode<Integer> q)
    {
        if(root==null)
            return null;
        if(root==p || root==q)
            return root;
        TreeNode<Integer> left=null;
        if(root.left!=null)
        left=func(root.left,p,q);
        TreeNode<Integer> right=null;
        if(root.right!=null)
        right=func(root.right,p,q);
       if(left!=null && right!=null)
        return root;
        if(left==null)
            return right;
        else
            return left;
       
    }

	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        return func(root,p,q);
	}
}
