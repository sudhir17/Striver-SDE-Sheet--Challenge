import java.util.ArrayList;
public class Solution {
  public static boolean checkdfs(int node, ArrayList<ArrayList<Integer>> adj,boolean visited[],boolean dfsvisited[])
  {
    visited[node]=true;
    dfsvisited[node]=true;
    for(Integer it:adj.get(node))
    {
      if(!visited[it])
      {
        if(checkdfs(it,adj,visited,dfsvisited))
          return true;
      }
      else if(dfsvisited[it])
        return true;
    }
    dfsvisited[node]=false;
    return false;
  }
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
     ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
     for(int i=0;i<=n;i++)
        adj.add(new ArrayList<>());
      for(int i=0;i<edges.size();i++)
      {
        adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
      }
      boolean visited[]=new boolean[n+1];
      boolean dfsvisited[]=new boolean[n+1];
      for(int i=1;i<=n;i++)
      {
        if(!visited[i])
        {
            if(checkdfs(i,adj,visited,dfsvisited))
              return true;
        }
      }
    return false;
  }
}
