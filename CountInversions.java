import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int nsum=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum+=arr.get(i);

        HashSet<Integer> set=new HashSet<>();
        int duplicate=-1;
        for(int i=0;i<arr.size();i++)
        {
                if(set.contains(arr.get(i)))
                {
                    duplicate=arr.get(i);
                }
                set.add(arr.get(i));
                
        }
        int missing=nsum-sum+duplicate;
        return new int[]{missing, duplicate};
    }
}
