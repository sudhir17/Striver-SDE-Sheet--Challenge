import java.util.*;
public class Solution {
	public static long func(int ind,int arr[],int value,long dp[][])
	{
		if(value==0)
			return 1;
		if(ind>=arr.length)
			return 0;
		if(dp[ind][value]!=-1l)
			return dp[ind][value];
		long take=0;
		if(arr[ind]<=value)
		 take=func(ind,arr,value-arr[ind],dp);
		long nottake=func(ind+1,arr,value,dp);
		return dp[ind][value]=take+nottake;
	}
	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here	
		long dp[][]=new long[denominations.length][value+1];
		for(long []i:dp)
		{
			Arrays.fill(i,-1);
		}
		return func(0,denominations,value,dp);		

	}
	
}
