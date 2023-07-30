import java.util.* ;
import java.io.*; 
public class Solution 
{
   public static int compareVersions(String a, String b) 

    {

        // Write your code here

 

        String []arr1= a.split("[.]");

        String []arr2= b.split("[.]");

 

        int length = (arr1.length>arr2.length)? arr1.length : arr2.length;

        int i=0;

        double val1=0;

        double val2=0;

        

        while(i<length){

 

            val1= (i<arr1.length) ? Double.valueOf(arr1[i]): 0;

 

            val2= (i<arr2.length)? Double.valueOf(arr2[i]): 0;

 

            if(val1>val2)

                return 1;

            else if(val1==val2){

                i++;

            }

             else 

                    return -1;

            }

        return 0;

        }
}
