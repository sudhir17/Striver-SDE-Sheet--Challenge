import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1,j=0;
        int count=1;
        int max=1;
        while(i<n&&j<n)
        {
            if(at[i]>dt[j])
            {
                count--;
                j++; 
            }
            else {
               count++;
                i++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
