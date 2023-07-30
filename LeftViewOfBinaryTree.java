import java.util.* ;

//import javax.swing.tree.TreeNode;

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

// import javax.swing.tree.TreeNode;

// import com.sun.tools.javac.code.Attribute.Array;

public class Solution 
{
    public static void func(TreeNode<Integer> root,ArrayList<Integer> list,int level)
    {
        if(root==null)
            return;
        if(list.size()==level)
            list.add(root.data);
        func(root.left,list,level+1);
        func(root.right,list,level+1);

    }
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        // func(root,list,0);
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=1;i<=size;i++)
            {
                TreeNode<Integer> node=queue.poll();
                if(i==1)
                    list.add(node.data);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
        }
        return list;
    }
}
