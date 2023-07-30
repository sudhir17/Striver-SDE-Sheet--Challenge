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

public class Solution 

{

    public static TreeNode<Integer> invertBinaryTree(TreeNode<Integer> root, TreeNode<Integer> leaf) {

        // Write your code here.

        //finding parents

        Map<TreeNode<Integer>, TreeNode<Integer>> map = new HashMap<>();

        findParents(root, map);

 

        //inverting tree

        return invert(leaf, map);

    }

 

    static void findParents(TreeNode<Integer> root, Map<TreeNode<Integer>, TreeNode<Integer>> map){

        if(root == null){

            return;

        }

 

        if(root.left != null){

            map.put(root.left, root);

        }

        if(root.right != null){

            map.put(root.right, root);

        }

 

        findParents(root.left, map);

        findParents(root.right, map);

    }

 

    static TreeNode invert(TreeNode<Integer> root, Map<TreeNode<Integer>, TreeNode<Integer>> map){

 

        while(map.containsKey(root)){

            TreeNode<Integer> parent = map.get(root);

 

            if(parent.left == root){

                parent.left = null;

            }else{

                parent.right = parent.left;

                parent.left = null;

            }

 

            root.left = parent;

            root = parent;

        }

 

        return root;

    }

}
