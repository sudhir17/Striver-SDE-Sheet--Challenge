import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/
class Pair{
	int hd;
	BinaryTreeNode node;
	Pair(int hd,BinaryTreeNode node)
	{
		this.hd=hd;
		this.node=node;
	}
}
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		if(root==null)
			return new ArrayList<>();
		Map<Integer,Integer> map=new TreeMap<>();
		Queue<Pair> queue=new LinkedList<>();
		queue.add(new Pair(0,root));
		while(!queue.isEmpty())
		{
			Pair p=queue.poll();
			BinaryTreeNode node=p.node;
			int hd=p.hd;
			if(!map.containsKey(hd))
				map.put(hd,node.val);
			if(node.left!=null)
				queue.add(new Pair(hd-1,node.left));
			if(node.right!=null)
				queue.add(new Pair(hd+1,node.right));
		}
		ArrayList<Integer> list=new ArrayList<>();
		for(Map.Entry<Integer,Integer> m:map.entrySet())
		{
			list.add(m.getValue());
		}
		return list;
	}
}
