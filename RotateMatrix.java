import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
       
        int dir=0;
        int left=0,right=m-1,top=0,bottom=n-1;
       int j=0,k=0;

       int var=mat.get(0).get(0);
        while(left<right && top<bottom)
        {
            int prev=mat.get(top+1).get(left);
         
                for(int i=left;i<=right;i++)
                {
                    int temp=mat.get(top).get(i);
                    mat.get(top).set(i,prev);
                    prev=temp;
                }
              
                top++;
          
               for(int i=top;i<=bottom;i++)
                {
                    int temp=mat.get(i).get(right);
                    mat.get(i).set(right,prev);
                    prev=temp;
                }
              
                right--; 
           
               for(int i=right;i>=left;i--)
                {
                    int temp=mat.get(bottom).get(i);
                    mat.get(bottom).set(i,prev);
                    prev=temp;
                }
             
                bottom--;;  
           
               for(int i=bottom;i>=top;i--)
                {
                    int temp=mat.get(i).get(left);
                    mat.get(i).set(left,prev);
                    prev=temp;
                }
             
                left++;
              
        }

    }
}
