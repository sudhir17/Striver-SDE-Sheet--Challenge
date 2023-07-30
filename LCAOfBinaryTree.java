import java.util.* ;
import java.io.*; 
/************************************************************

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

************************************************************/

public class Solution 
{
    public static int func(TreeNode<Integer> root,int x,int y)
    {
        if(root==null)
            return -1;
        if(root.data==x)
            return x;
        if(root.data==y)
            return y;
        int left=func(root.left,x,y);
        int right=func(root.right,x,y);
        if(left>=0 && right>=0)
            return root.data;
        if(left>=0)
            return left;
        if(right>=0)
            return right;
        return -1;
    }
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) 
    {
       return func(root,x,y);
    }
}
