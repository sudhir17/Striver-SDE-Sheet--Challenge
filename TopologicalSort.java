import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj,boolean visited[],Stack<Integer> st)
    {
        visited[node]=true;
        for(Integer it:adj.get(node))
        {
            if(!visited[it])
                dfs(it,adj,visited,st);
        }
        st.push(node);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<edges.size();i++)
        {
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }

        boolean visited[]=new boolean[v];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<v;i++)
        {
            if(!visited[i])
            {
                dfs(i,adj,visited,st);
            }
        }
        ArrayList<Integer> topo=new ArrayList<>();
        while(!st.isEmpty())
        {
            topo.add(st.pop());
        }
        return topo;
        // int indegree[]=new int[v];
        // for(int i=0;i<v;i++)
        // {
        //     for(Integer j:adj.get(i))
        //     {
        //         indegree[j]++;
        //     }
        // }
        // ArrayList<Integer> topo=new ArrayList<>();
        // Queue<Integer> que=new LinkedList<>();
        // for(int i=0;i<indegree.length;i++)
        // {
        //     if(indegree[i]==0)
        //         que.add(i);
        // }

        // while(!que.isEmpty())
        // {
        //     int node=que.poll();
        //     topo.add(node);
        //     for(Integer it:adj.get(node))
        //     {
        //         indegree[it]--;
        //         if(indegree[it]==0)
        //             que.add(it);
        //     }
        // }
        // return topo;
    }
}
