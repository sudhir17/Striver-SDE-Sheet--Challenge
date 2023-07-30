import java.util.* ;
import java.io.*; 
public class Solution {
    public static int func(int i,int j,int [][]grid,int visited[][])
    {
        if(i>=grid.length || j>=grid[0].length )
            return (int)1e9;
        if(i==grid.length-1 && j==grid[0].length-1)
            return grid[grid.length-1][grid[0].length-1];
        if(visited[i][j]!=-1)
            return visited[i][j];
        int down=0,right=0;
       
         down=func(i+1,j,grid,visited);
         right=func(i,j+1,grid,visited);
        
        return visited[i][j]=grid[i][j]+Math.min(down,right);
    }
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int visited[][]=new int[grid.length][grid[0].length];
        for(int i[]:visited)
        {
            Arrays.fill(i,-1);
        }
        return func(0,0,grid,visited);
    }
}
