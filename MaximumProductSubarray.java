import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int left=Integer.MIN_VALUE;
	
		int res=1;
		for(int i=0;i<arr.size();i++)
		{
			res=res*arr.get(i);
			
			left=Math.max(left,res);
			if(res==0)
				res=1;
			
			
		}
			int right=Integer.MIN_VALUE;
		res=1;
		for(int i=arr.size()-1;i>=0;i--)
		{
			res=res*arr.get(i);
		
			right=Math.max(right,res);
			if(res==0)
				res=1;
		}
		return Math.max(left,right);
	}
}
