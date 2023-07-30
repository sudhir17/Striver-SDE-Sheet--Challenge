import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
class Pair{
	BinaryTreeNode<Integer> node;
	int value;
	Pair(BinaryTreeNode node,int value)
	{
		this.node=node;
		this.value=value;
	}
}
public class Solution { 
	public static void func(BinaryTreeNode<Integer> root,ArrayList<Integer> pre,ArrayList<Integer>in,ArrayList<Integer> post)
	{
		if(root==null)
			return;
		pre.add(root.data);
		func(root.left,pre,in,post);
		in.add(root.data);
		func(root.right,pre,in,post);
		post.add(root.data);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.

		List<List<Integer>> res=new ArrayList<>();
		ArrayList<Integer> pre=new ArrayList<>();
		ArrayList<Integer> in=new ArrayList<>();
		ArrayList<Integer> post=new ArrayList<>();
		// func(root,pre,in,post);
		if(root==null)
			return res;
		Stack<Pair> stack=new Stack<>();
		stack.add(new Pair(root,1));
		while(!stack.isEmpty())
		{
			Pair st=stack.pop();
			if(st.value==1)
			{
				pre.add(st.node.data);
				stack.push(new Pair(st.node,st.value+1));
				if(st.node.left!=null)
					stack.push(new Pair(st.node.left,1));
			}
			else if(st.value==2)
			{
				in.add(st.node.data);
				stack.push(new Pair(st.node,st.value+1));
				if(st.node.right!=null)
					stack.push(new Pair(st.node.right,1));
			}
			else {
				post.add(st.node.data);
			}

		}
		res.add(in);
		res.add(pre);
		res.add(post);

		return res;
    }
}
