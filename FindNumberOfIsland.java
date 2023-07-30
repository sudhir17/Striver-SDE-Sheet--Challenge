import java.util.Queue;
import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
public class Solution 
{
    public static void bfs(int i,int j,int mat[][],int visited[][])
    {
        visited[i][j]=1;
        Queue<Pair> que=new LinkedList<>();
        que.add(new Pair(i,j));
        while(!que.isEmpty())
        {
            int first=que.peek().first;
            int second=que.peek().second;
            que.poll();
            for(int deltai=-1;deltai<=1;deltai++)
            {
                for(int deltaj=-1;deltaj<=1;deltaj++)
                {
                    int nrow=first+deltai;
                    int ncol=second+deltaj;
                    if(nrow>=0 && nrow<mat.length && ncol>=0 && ncol<mat[0].length && (visited[nrow][ncol]==0) && (mat[nrow][ncol]==1))
                    {
                        visited[nrow][ncol]=1;
                        que.add(new Pair(nrow,ncol));
                    }
                }
            }
        }

    }
    public static int getTotalIslands(int[][] mat) 
	{
        int m=mat.length,n=mat[0].length;
        int visited[][]=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]==0 && mat[i][j]==1)
                {
                    bfs(i,j,mat,visited);
                    count++;
                }
            }
        }
        return count;
    }
}
