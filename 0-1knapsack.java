import java.util.*;

public class Solution {
	public static int func(int ind,int w,ArrayList<Integer> value,ArrayList<Integer> weights,int dp[][])
	{
		if(ind==value.size())
			return 0;
		if(dp[ind][w]!=-1)
			return dp[ind][w];
		int pick=Integer.MIN_VALUE;
		if(weights.get(ind)<=w)
		pick=value.get(ind)+func(ind+1,w-weights.get(ind),value,weights,dp);
		int notpick=func(ind+1,w,value,weights,dp);
		return dp[ind][w]=Math.max(pick,notpick);
	}
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
		// int dp[][]=new int[n+1][w+1];
		// // for(int i[]:dp)
		// // 	Arrays.fill(i,-1);
		// // return	func(0,w,values,weights,dp);

		// for(int i=1;i<=n;i++)
		// {
		// 	for(int j=1;j<=w;j++)
		// 	{
		// 	int pick=Integer.MIN_VALUE;
		// if(weights.get(i)<=j)
		// pick=values.get(i)+dp[i-1][j-weights.get(i)];
		// int notpick=dp[i-1][j];
		//  dp[i][j]=Math.max(pick,notpick);	
		// 	}
		// }
		// return dp[n][w];
		 int dp[][]=new int[n+1][w+1];
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {
                if(weights.get(i-1)<=j)
                    dp[i][j]= Math.max(values.get(i-1)+dp[i-1][j-weights.get(i-1)],dp[i-1][j]);
                else 
                dp[i][j]=dp[i-1][j]; 
            }
        }
            return dp[n][w];
    
	}
}
