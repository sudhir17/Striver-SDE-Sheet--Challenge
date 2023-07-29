import java.util.* ;
import java.io.*; 
public class Solution {
    public static void func(int row,int col,int [][]maze,int n,int ans[][],ArrayList<ArrayList<Integer>> list,boolean[][] visited)
    {
        if(row<0 || row>=n || col<0 || col>=n || maze[row][col]==0 || visited[row][col]==true)
         return;
          ans[row][col]=1;
        if(row==n-1 && col==n-1 && maze[row][col]==1)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    temp.add(ans[i][j]);

            }
            list.add(temp);
            return;
        }
        visited[row][col]=true;
       
        func(row+1,col,maze,n,ans,list,visited);
        func(row,col+1,maze,n,ans,list,visited);
        func(row-1,col,maze,n,ans,list,visited);
        func(row,col-1,maze,n,ans,list,visited);
        ans[row][col]=0;
        visited[row][col]=false;
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int ans[][]=new int[n][n];
          boolean visited[][]=new boolean[n][n];
        func(0,0,maze,n,ans,list,visited);
        return list;
    }
}
