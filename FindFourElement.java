import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      Arrays.sort(arr);
      // Write your code here.
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          int k=j+1,l=n-1;
          while(k<l)
          {
            int sum=arr[i]+arr[j]+arr[k]+arr[l];
            if(sum==target)
            {
              return "Yes";
            }
            else if(sum>target)
            {
              l--;
            }
            else 
            k++;
          }
        }

      }
      return "No";
  }
}
