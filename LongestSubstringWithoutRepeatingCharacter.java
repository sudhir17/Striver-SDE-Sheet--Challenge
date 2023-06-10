import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int arr[]=new int[26];
		int i=0,j=1;
		arr[input.charAt(0)-'a']++;
		int max=1;
		while(j<input.length())
		{
			if(arr[input.charAt(j)-'a']==0)
			{
				arr[input.charAt(j)-'a']++;

				
				j++;
			}
			else 
			{
				max=Math.max(max,j-i);
				arr[input.charAt(i)-'a']--;
				i++;
			}

		}
		max=Math.max(max,j-i);
		//max=Math.max(max,j-i);
		return max;
		//write your code here
	}
}
