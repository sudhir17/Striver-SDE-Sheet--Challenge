import java.util.ArrayList;
import java.util.Queue;
import java.util.*;
public class Solution {
    public static boolean bfs(int node,ArrayList<ArrayList<Integer>> adj,int color[])
    {
        color[node]=0;
        Queue<Integer> que=new LinkedList<>();
        que.add(node);
        while(!que.isEmpty())
        {
            int temp=que.poll();
            for(Integer it:adj.get(temp))
            {
                if(color[it]==-1)
                {
                    color[it]=1-color[temp];
                    que.add(it);
                }
                else if(color[it]==color[temp])
                    return false;
            }
        }
        return true;
    }
    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<edges.size();i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++)
        {
            for(int j=0;j<edges.get(i).size();j++)
            {
                if(edges.get(i).get(j)==1)
                {
                adj.get(i).add(j);
                adj.get(j).add(i);
                }
            }
        }

        int color[]=new int[edges.size()];
        Arrays.fill(color,-1);
        for(int i=0;i<edges.size();i++)
        {
            if(color[i]==-1)
            {
                if(dfs(i,adj,color,0)==false)
                    return false;
            }
        }
        
        //System.out.println(adj);
        return true;
    }
    public static boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int color[],int col)
    {
        color[node]=col;
        for(Integer it:adj.get(node))
        {
            if(color[it]==-1)
            {
                if(dfs(it,adj,color,1-col)==false)
                    return false;
            }
            else if(color[it]==col)
                return false;
        }
        return true;
    }
}
