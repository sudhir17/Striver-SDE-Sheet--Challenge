import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
	   Queue<BinaryTreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
		if(root==null)
	  		return list;
	    queue.add(root);
        while(!queue.isEmpty())
        {
			int size=queue.size();
            for(int i=1;i<=size;i++)
            {
               
                BinaryTreeNode node=queue.poll();
				    list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            
            
        }
		return list;
    //Your code goes here
  }

}
