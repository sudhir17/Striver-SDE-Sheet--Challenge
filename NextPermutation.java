import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static void swap(ArrayList<Integer> arr,int i,int j)
    {
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
    }
    public static void reverse(ArrayList<Integer> arr, int index)
    {
        for(int i=index,j=arr.size()-1;i<j;i++,j--)
        {
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
	    int i=permutation.size()-2;
         while (i >= 0 && permutation.get(i + 1) <= permutation.get(i)) {
            i--;
        }
        if (i >= 0) {
            int j = permutation.size() - 1;
            while (permutation.get(j) <= permutation.get(i)) {
                j--;
            }
            swap(permutation, i, j);
        }
        reverse(permutation, i + 1);
    
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        for(int k=0;k<permutation.size();k++)
        res.add(permutation.get(k));
        return res;
	}
}
