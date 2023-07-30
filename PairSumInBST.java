import java.util.* ;
import java.io.*; 
/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/

public class Solution {
	public static void func(BinaryTreeNode root,ArrayList<Integer> list)
	{
		if(root==null)
			return;
		func(root.left,list);
		list.add(root.data);
		func(root.right,list);
	}
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		ArrayList<Integer> list=new ArrayList();
		func(root,list);
		Collections.sort(list);
		int i=0,j=list.size()-1;
		while(i<j)
		{
			int sum=list.get(i)+list.get(j);
			if(sum==k)
				return true;
			else if(sum>k)
			j--;
			else 
			i++;
		}
		return false;
	}
}

