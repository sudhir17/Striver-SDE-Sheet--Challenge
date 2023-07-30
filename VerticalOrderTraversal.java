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
class Tuple{
    TreeNode<Integer> node;
    int hd;
    int level;
    Tuple(TreeNode node,int hd,int level)
    {
        this.node=node;
        this.hd=hd;
        this.level=level;
    }
}
public class Solution 
{
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        Map<Integer,Map<Integer,ArrayList<Integer>>> map=new TreeMap<>();
        Queue<Tuple> queue=new LinkedList<>();
        queue.add(new Tuple(root,0,0));
        while(!queue.isEmpty())
        {
            Tuple t=queue.poll();
            TreeNode<Integer> node=t.node;
            int hd=t.hd;
            int level=t.level;
            if(!map.containsKey(hd))
                map.put(hd, new TreeMap<>());
            if(!map.get(hd).containsKey(level))
                map.get(hd).put(level,new ArrayList<>());
            map.get(hd).get(level).add(node.data);
            if(node.left!=null)
            {
                queue.add(new Tuple(node.left,hd-1,level+1));
            }
            if(node.right!=null)
            {
                queue.add(new Tuple(node.right,hd+1,level+1));
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map<Integer,ArrayList<Integer>> m:map.values())
        {
            for(ArrayList<Integer> pq:m.values())
            {
                for(int i=0;i<pq.size();i++)
                    list.add(pq.get(i));
            }
        }
        return list;
        //  List < List < Integer >> list = new ArrayList < > ();
        // for (Map < Integer, PriorityQueue < Integer >> ys: map.values()) {
        //     list.add(new ArrayList < > ());
        //     for (PriorityQueue < Integer > nodes: ys.values()) {
        //         while (!nodes.isEmpty()) {
        //             list.get(list.size() - 1).add(nodes.poll());
        //         }
        //     }
        // }
        // //return list;
        // ArrayList<Integer> res=new ArrayList<Integer>();
        // for(int i=0;i<list.size();i++)
        // {
        //     for(int j=0;j<list.get(i).size();j++)
        //         res.add(list.get(i).get(j));
        // }
        // return res;
        //    Write your code here.
    }
}
