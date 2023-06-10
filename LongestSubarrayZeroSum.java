import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer,Integer> map=new HashMap();
		map.put(0,-1);
		int sum=0;
		int max=0;
		for(int i=0;i<arr.size();i++)
		{
			sum=sum+arr.get(i);
			if(map.containsKey(sum))
			{
				int temp=i-map.get(sum);
				max=Math.max(max,temp);
			}
			else 
				map.put(sum,i);

		}
		return max;	
		// Write your code here.
	}
}
