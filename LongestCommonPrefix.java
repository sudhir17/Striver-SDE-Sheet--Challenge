import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		Arrays.sort(arr);
		int j=Math.min(arr[0].length(),arr[n-1].length());
		String res="";
		for(int i=0;i<j;i++)
		{
			if(arr[0].charAt(i)==arr[n-1].charAt(i))
				res=res+arr[0].charAt(i);
			else 
				break;
		}
		return res;
	}

}
