import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution 
{
	static TreeNode prev=null;
	public static void func(TreeNode<Integer> root)
	{
		if(root==null)
			return;
		func(root.right);
		func(root.left);
		root.right=prev;
		root.left=null;
		prev=root;
	}
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
		if(root==null)
			return null;
		// func(root);
		// return root;
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode curr=stack.pop();
			if(curr.right!=null)
				stack.push(curr.right);
			if(curr.left!=null)
				stack.push(curr.left);
			if(!stack.isEmpty())
				curr.right=stack.peek();
			curr.left=null;
		}
		return root;
    }
}
