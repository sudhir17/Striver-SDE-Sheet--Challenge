import java.util.*;
class Pair{
    int node;
    int parent;
    Pair(int node,int parent)
    {
        this.node=node;
        this.parent=parent;   
    }
}
public class Solution {
    public static boolean checkBfs(int node, ArrayList<ArrayList<Integer>> adj,boolean visited[])
    {
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(node,-1));
        visited[node]=true;
        while(!que.isEmpty())
        {
            int temp=que.peek().node;
            int parent=que.peek().parent;
            que.poll();
             for(Integer it:adj.get(temp))
            {
                if(!visited[it])
                {
                    visited[it]=true;
                    que.add(new Pair(it,temp));
                }
                else if(parent!=it)
                    return true;
            }
        }
        return false;
    }
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);

        }
        boolean visited[]=new boolean[n+1];
        for(int i=1;i<=n;i++)
        {
            if(!visited[i])
            {
                if(checkDfs(i,-1,adj,visited))
                    return "Yes";
            }
        }
        return "No";
        // System.out.println(adj);
    }
    public static boolean checkDfs(int node, int par,ArrayList<ArrayList<Integer>> adj,boolean visited[])
    {
        visited[node]=true;
        for(Integer it:adj.get(node))
        {
            if(!visited[it])
            {
               if(checkDfs(it,node,adj,visited))
                return true;
            }
            else if(it!=par)
                return true;
        }
        return false;
    }
    
}
