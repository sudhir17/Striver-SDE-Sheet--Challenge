import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the TreeNode class:

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


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> func(ArrayList<Integer> arr,int low,int up,TreeNode<Integer> root)
    {
        if(low>up)
            return root;
        int mid=(low+up)/2;
        root=new TreeNode<>(arr.get(mid));
        root.left=func(arr,low,mid-1,root.left);
        root.right=func(arr,mid+1,up,root.right);
        return root;
    }
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
         return func(arr,0,n-1,null);
    }
}
