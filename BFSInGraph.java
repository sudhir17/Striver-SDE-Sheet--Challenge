import java.util.* ;


import java.io.*; 
public class Solution {
	public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<vertex;i++)
			adj.add(new ArrayList<>());
		for(int i=0;i<edges[0].length;i++)
		{
			adj.get(edges[0][i]).add(edges[1][i]);
			adj.get(edges[1][i]).add(edges[0][i]);
		}
		   for(int i=0;i<vertex;i++)
        {
           Collections.sort(adj.get(i));
        } 
		  ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        
		 boolean visited[]=new boolean[vertex];
		for(int i=0;i<vertex;i++)
        {
          
            if(visited[i]==false)
            {
					ArrayList<Integer> res=new ArrayList<>();
	
		Queue<Integer> que=new LinkedList<>();
		
		que.add(i);
		visited[i]=true;
		while(!que.isEmpty())
		{
			Integer node=que.poll();
			res.add(node);
			for(Integer it:adj.get(node))
			{
				if(!visited[it])
				{
					visited[it]=true;	
					que.add(it);
				}
			}
		}
		 arr.add(res); 
			}}
			 ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.get(i).size();j++)
                ans.add(arr.get(i).get(j));
        }
       
        return ans;
	

	}
}

