import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static boolean func(TreeNode root,int x,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return false;
        }
        list.add(root.data);
        if(root.data==x)
        {
           return true;
        }
        
       boolean left= func(root.left,x,list);
       boolean right= func(root.right,x,list);
       if(left||right)
        return true;
        list.remove(list.size()-1);
        return false;
    }
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> list=new ArrayList<>();
        func(root,x,list);
        return list;
    }
}
