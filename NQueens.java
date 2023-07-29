import java.util.*;
public class Solution {
    public static boolean isSafe(int row,int col,int board[][],int n)
    {
        int i=row,j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]==1)
                return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(j>=0)
        {
            if(board[i][j]==1)
                return false;
            j--;
        }
        i=row;
        j=col;
        while(i<n && j>=0 )
        {
            if(board[i][j]==1)
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void func(int col,int board[][],int n,ArrayList<ArrayList<Integer>> list,int left[],int lowerdiag[],int upperdiag[]){

        if(col==n)
        {
             ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
               
                for(int j=0;j<n;j++)
                {
                    temp.add(board[i][j]);
                }
                
            }
            list.add(temp);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(left[row]==0 && lowerdiag[row+col]==0 && upperdiag[n-1+col-row]==0)
            {
                left[row]=1;
                lowerdiag[row+col]=1;
                upperdiag[n-1+col-row]=1;
                board[row][col]=1;
                func(col+1,board,n,list,left,lowerdiag,upperdiag);
                board[row][col]=0;
                left[row]=0;
                lowerdiag[row+col]=0;
                upperdiag[n-1+col-row]=0;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        int board[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],0);
        }
        int left[]=new int[n];
        int lowerdiag[]=new int[2*n-1];
        int upperdiag[]=new int[2*n-1];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        func(0,board,n,list,left,lowerdiag,upperdiag);
        return list;

    }
}
