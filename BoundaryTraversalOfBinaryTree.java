/************************************************************

    Following is the Binary Tree node structure:
    
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

import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static boolean isLeaf(TreeNode root)
    {
        return root.left==null && root.right==null;
    }
    public static void leftBoundry(TreeNode root,ArrayList<Integer> res)
    {
        TreeNode curr=root.left;
        while(curr!=null)
        {
            if(!isLeaf(curr))
                res.add(curr.data);
            if(curr.left!=null)
                curr=curr.left;
            else 
                curr=curr.right;
        }
    }
    public static void rightBoundry(TreeNode root,ArrayList<Integer> res)
    {
        ArrayList<Integer> temp=new ArrayList<Integer>();
        TreeNode curr=root.right;
        while(curr!=null)
        {
            if(!isLeaf(curr))
                temp.add(curr.data);
            if(curr.right!=null)
                curr=curr.right;
            else 
                curr=curr.left;
        }
        for(int i=temp.size()-1;i>=0;i--)
            res.add(temp.get(i));
    }
    public static void leafNodeTraversal(TreeNode root,ArrayList<Integer> res)
    {
        if(isLeaf(root))
        {
           res.add(root.data);
            return;
        }
        if(root.left!=null)
        leafNodeTraversal(root.left,res);
        if(root.right!=null)
        leafNodeTraversal(root.right,res);
    }
	public static ArrayList<Integer> traverseBoundary(TreeNode root){
        ArrayList<Integer> res=new ArrayList<Integer>();
            if(isLeaf(root)==false)
                res.add(root.data);
        leftBoundry(root,res);
        leafNodeTraversal(root,res);
        rightBoundry(root,res);
		// Write your code here.
        return res;
	}
}
