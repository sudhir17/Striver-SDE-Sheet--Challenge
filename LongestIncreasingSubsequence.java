import java.util.*;
public class Solution {
	public static int func(int ind,int arr[],int prev,int dp[][])
	{
		if(ind==arr.length)
			return 0;
		if(dp[ind][prev+1]!=-1)
			return dp[ind][prev+1];
			int pick=0;

		if(prev==-1 || arr[prev]<arr[ind])
		 pick=1+func(ind+1,arr,ind,dp);
		 int notpick=func(ind+1,arr,prev,dp);
		 return dp[ind][prev+1]=Math.max(pick,notpick);
	}
public static int fun(int prev, int ind, int[]nums,int[][]dp){
        if(ind==nums.length)
        return 0;
        if(dp[prev+1][ind]!=-1)
        return dp[prev+1][ind];
       int take=Integer.MIN_VALUE;
        if(prev==-1 || nums[prev]<nums[ind]){
            take = 1+fun(ind,ind+1,nums,dp);
        }
        int notTake = fun(prev,ind+1,nums,dp);
        return dp[prev+1][ind]= Math.max(take,notTake);
    }

	public static int longestIncreasingSubsequence(int arr[]) {
		int n=arr.length;
		int dp[][]=new int[n][n+1];
		for(int i[]:dp)
			Arrays.fill(i,-1);
		return func(-1,0,arr,dp);
	}

}



