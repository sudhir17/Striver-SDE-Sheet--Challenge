import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		PriorityQueue<Integer> min=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.size();i++)
		{
			min.add(arr.get(i));
			if(min.size()>k)
				min.poll();
		}
		PriorityQueue<Integer> max=new PriorityQueue<>();
		for(int i=0;i<arr.size();i++)
		{
			max.add(arr.get(i));
			if(max.size()>k)
				max.poll();
		}
		ArrayList<Integer> res=new ArrayList<>();
		res.add(min.poll());
		res.add(max.poll());
		return res;
	}
}
