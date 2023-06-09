import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                zero++;
            else if(arr[i]==1)
                one++;
            else 
                two++;
        }
        int j=0;
        while(zero>0)
        {
            arr[j]=0;
            j++;
            zero--;
        }
        while(one>0)
        {
            arr[j]=1;
            j++;
            one--;
        }
        while(two>0)
        {
            arr[j]=2;
            j++;
            two--;
        }
        //Write your code here
    }
}
