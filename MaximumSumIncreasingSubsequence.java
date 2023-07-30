import java.util.*;
public class Solution {
    public static int func(int i,int j,String str1,String str2,int dp[][])
    {
       if(i==0)
        return j;
        if(j==0)
            return i;
            if(dp[i][j]!=-1)
                return dp[i][j];
        if(str1.charAt(i-1)==str2.charAt(j-1))
            return dp[i][j]=func(i-1,j-1,str1,str2,dp);
        else 
        return dp[i][j]=1+Math.min(func(i-1,j,str1,str2,dp),Math.min(func(i,j-1,str1,str2,dp),func(i-1,j-1,str1,str2,dp)));
    }
    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        // for(int i[]:dp)
        // {
        //     Arrays.fill(i,-1);
        // }
        for(int i=0;i<=str2.length();i++)
            dp[0][i]=i;
        for(int i=0;i<=str1.length();i++)
            dp[i][0]=i;
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                 if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else 
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));

            }
        }
        return dp[str1.length()][str2.length()];
    }
}



