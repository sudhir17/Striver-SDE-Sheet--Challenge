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

import java.util.ArrayList;
import java.util.*;

public class Solution 
{
  public static TreeNode<Integer> func(int preStart,int preEnd,ArrayList<Integer> preorder,int inStart,int inEnd,ArrayList<Integer> inorder,HashMap<Integer,Integer> map)
    {
        if(preStart>preEnd || inStart>inEnd)
            return null;
        TreeNode<Integer> root=new TreeNode(preorder.get(preStart));
        int inRoot=map.get(preorder.get(preStart));
        int size=inRoot-inStart;
        root.left=func(preStart+1,preStart+size,preorder,inStart,inRoot-1,inorder,map);
        root.right=func(preStart+size+1,preEnd,preorder,inRoot+1,inEnd,inorder,map);
        return root;
    }
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.size();i++)   
            map.put(inorder.get(i),i);

        TreeNode<Integer> root=func(0,preorder.size()-1,preorder,0,inorder.size()-1,inorder,map);
        return root;        
    }
}
