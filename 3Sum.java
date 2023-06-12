import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			int j=i+1,k=n-1;
			int target=K-arr[i];
			while(j<k)
			{
				int sum=arr[j]+arr[k];
				 if(sum>target)
				{
					k--;
				}
				else if(sum<target) 
					j++;
				else
				{	
					ArrayList<Integer> res=new ArrayList<>();
					int x=arr[j];
					int y=arr[k];
					res.add(arr[i]);
					res.add(x);
					res.add(y);
					list.add(res);
					while(j<k&&arr[j]==x)
						j++;
					while(j<k && arr[k]==y)
						k--;
					//j++;
					//k--;
				}
				
			}
			while(i+1<n && arr[i]==arr[i+1])
				i++;
		}
		return list;
	    // Write your code here.

	}
}
