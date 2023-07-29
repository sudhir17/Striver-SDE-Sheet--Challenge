import java.util.*;
public class Solution {
    public static boolean isSafe(int node,ArrayList<ArrayList<Integer>> adj,int color[],int col)
    {
        for(int it:adj.get(node))
        {
            if(color[it]==col)
                return false;
        }
        return true;
    }
    public static boolean func(int node,ArrayList<ArrayList<Integer>> adj,int color[],int n,int m)
    {
        if(node==n)
            return true;
        for(int i=1;i<=m;i++)
        {
            if(isSafe(node,adj,color,i))
            {
                color[node]=i;
                if(func(node+1,adj,color,n,m))
                    return true;
                color[node]=0;
            }
        }
        return false;

    }
    public static String graphColoring(int [][]mat, int m) {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                adj.get(i).add(j);
            }
        }
        int color[]=new int[mat.length];
        if(func(0,adj,color,mat.length,m))
            return "YES";
        return "NO";
    }
}
