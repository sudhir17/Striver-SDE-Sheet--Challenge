import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        int max=0;
        for(int i=0;i<jobs.length;i++)
            max=Math.max(jobs[i][0],max);
        int res[]=new int[max+1];
        res[0]=1;
        Arrays.sort(jobs,((a,b)->b[1]-a[1]));
        int totalProfit=0;
        for(int i=0;i<jobs.length;i++)
        {
            int j=jobs[i][0];
            while(j>=0 && res[j]!=0)
                j--;
            if(j>=0)
            {
                res[j]=1;
                totalProfit=totalProfit+jobs[i][1];
            }
        }
        return totalProfit;
    }
}
