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

public class Solution {

    public  static int findCeil(TreeNode<Integer> root, int x) {

        int ans=-1;
        while(root!=null)
        {
            if(root.data<x)
            {
                
                root=root.right;
            }
            else {
                ans=root.data;
                root=root.left;
            }
        }
        return ans;
        // Write your code here

    }
}
