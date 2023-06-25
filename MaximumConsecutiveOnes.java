import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int i=0;
		int j=1;
		int countZero=arr.get(0)==0?1:0;
		int max=0;

		while(j<arr.size())
		{
			if(arr.get(j)==0 && countZero<k)
			{
				countZero++;
				j++;
				max=Math.max(max,j-i);
			}
			else if(arr.get(j)==1)
			{
				j++;
				max=Math.max(max,j-i);
			}
			else {
				if(arr.get(i)==0)
					countZero--;
				i++;
			}
		}
		return max;
	}
}
