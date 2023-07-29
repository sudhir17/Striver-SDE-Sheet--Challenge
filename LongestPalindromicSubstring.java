public class Solution {	
	public static String longestPalinSubstring(String str) {
		int n=str.length();
		boolean dp[][]=new boolean[n][n];
		String res="";
		for(int g=0;g<n;g++)
		{
			for(int i=0,j=g;j<n;i++,j++)
			{
				if(g==0)
				{
					dp[i][j]=true;
				}
				else if(g==1)
				{
					if(str.charAt(i)==str.charAt(j))
						dp[i][j]=true;
					else 
						dp[i][j]=false;
				}
				else {
					if(str.charAt(i)==str.charAt(j)&& dp[i+1][j-1])
						dp[i][j]=true;
					else 
						dp[i][j]=false;
				}
				if(dp[i][j] && res.length()<j-i+1)
					res=str.substring(i,j+1);
			}

		}
		return res;
	}
}
