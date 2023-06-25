import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
      int arr[]={1,2,5,10,20,50,100,500,1000};
      int count=0;
      for(int i=arr.length-1;i>=0;i--)
      {
         if(amount>=arr[i])
         {
             int t=amount/arr[i];
             count=count+t;
             amount=amount-t*arr[i];
         }

      }
      return count;
        // Write your code here.
    }
}
