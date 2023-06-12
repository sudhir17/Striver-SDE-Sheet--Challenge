import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long left[]=new long[n];
        long right[]=new long[n];
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            left[i]=max;
        }
        max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            max=Math.max(max,arr[i]);
            right[i]=max;
        }
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;

    }
}
