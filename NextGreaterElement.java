import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer> stack=new Stack<>();
		int res[]=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			while(!stack.isEmpty() && arr[i]>=stack.peek())
				stack.pop();
			if(stack.isEmpty())
				res[i]=-1;
			else 
				res[i]=stack.peek();
			stack.push(arr[i]);
		}
		return res;
	}

}
