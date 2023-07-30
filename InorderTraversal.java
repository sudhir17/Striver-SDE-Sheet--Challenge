import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static void func(TreeNode root,List<Integer> list)
    {
        if(root==null)
            return;
        func(root.left,list);
        list.add(root.data);
        func(root.right,list);
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	List<Integer> list=new ArrayList<>();
        func(root,list);
        return list;
        
    }
}
