import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<kArrays.get(i).size();j++)
				pq.add(kArrays.get(i).get(j));
		}
		ArrayList<Integer> list=new ArrayList<>();
		while(!pq.isEmpty())
		{
			list.add(pq.poll());
		}
		return list;
	}
}
