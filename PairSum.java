import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> list=new ArrayList<>();
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++)
        // {
           int j=0,k=arr.length-1;
           while(j<k)
           {
               if(arr[j]+arr[k]==s)
               {
                   int first=arr[j],second=arr[k];
                   list.add(new int[]{first,second});
                  
                   while(j<k && arr[k-1]==arr[k])
                   {
                       list.add(new int[]{first,second});
                    k--;
                   }
                   while(j<k && arr[j+1]==arr[j])
                   {
                       list.add(new int[]{first,second});
                    j++;
                   }
                    j++;
                    k--;

               }
               else if(arr[j]+arr[k]>s)
               {
                   k--;
               }
               else 
               j++;
           }
        
        return list;
    }
}
//-3 -2 2 3 3 


