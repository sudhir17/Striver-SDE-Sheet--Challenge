import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int func(int ind,ArrayList<Integer> rack,int prev,int dp[][])
    {
        if(ind==0)
        {
             if(prev==-1)
                return rack.get(ind);
            return (rack.get(ind)<rack.get(prev))?rack.get(ind):0;
        }
        if(dp[ind][prev+1]!=-1)
            return dp[ind][prev+1];
        int pick =0;

        if( prev==-1 || rack.get(ind)<rack.get(prev))
         pick = rack.get(ind)+func(ind-1,rack,ind,dp);
        int notpick=func(ind-1,rack,prev,dp);
        return dp[ind][prev+1]=Math.max(pick,notpick);
    }
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int dp[][]=new int[n][n+1];
        for(int i[]:dp)
            Arrays.fill(i,-1);

        
        return func(n-1,rack,-1,dp);
    }

}
