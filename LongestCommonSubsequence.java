import java.util.*;
public class Solution {
	public static int func(int i,int j,String s,String t,int dp[][])
	{
		if(i==0 || j==0)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		if(s.charAt(i-1)==t.charAt(j-1))
			return dp[i][j]=1+func(i-1,j-1,s,t,dp);
		return dp[i][j]=Math.max(func(i-1,j,s,t,dp),func(i,j-1,s,t,dp));
	}
	public static int lcs(String s, String t) {
		int m=s.length(),n=t.length();
		int dp[][]=new int[m+1][n+1];
		// for(int i[]:dp)
		// {
		// 	Arrays.fill(i,-1);
		// }
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(s.charAt(i-1)==t.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else 
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		return dp[m][n];
		//Your code goes here
	//	return func(s.length(),t.length(),s,t,dp);
    }

}
