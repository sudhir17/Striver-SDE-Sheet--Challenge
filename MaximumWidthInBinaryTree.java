import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/

public class Solution {
	public static int getMaxWidth(TreeNode root) {
		// Write your code here.
		if(root==null)
			return 0;
		int ans=0;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			int size=queue.size();
			ans=Math.max(ans,size);
			for(int i=0;i<size;i++)
			{
				
				
				TreeNode node=queue.poll();
				
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);

			}
			//ans=Math.max(ans,last-first+1);
		}
		return ans;
	}
}
