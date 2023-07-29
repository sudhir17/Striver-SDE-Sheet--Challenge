import java.util.* ;
import java.io.*; 

import java.util.ArrayList;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		
		ArrayList<Integer> res=new ArrayList<>();
		int i=0;
		int j=0;
		int max=Integer.MIN_VALUE;
		while(j<k && j<nums.size())
		{
			max=Math.max(max,nums.get(j));
			j++;
		}
		res.add(max);
		i++;
		while(j<nums.size())
		{
			max=Integer.MIN_VALUE;
			int l=i;
			while(l<=j && l<nums.size())
			{
				max=Math.max(max,nums.get(l));
				l++;
			}
			res.add(max);
			i++;
			j++;
		}
		return res;
	}
}
