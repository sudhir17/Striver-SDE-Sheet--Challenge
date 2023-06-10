import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<N;i++)
                set.add(arr[i]);
        int count=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]-1))
            {
                count=0;
                int curr=arr[i];
                while(set.contains(curr))
                {
                    count++;
                    max=Math.max(count,max);
                    curr=curr+1;
                }

            }
        }
        return max;
    }
}
