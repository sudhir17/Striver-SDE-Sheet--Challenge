import java.util.* ;
import java.io.*; 
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
		//PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	  PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for (int i = 0; i < k; i++) {
            pq.add(Integer.MIN_VALUE);
        }
        for (int aValue : a) {
            for (int bValue : b) {
                int sum = aValue + bValue;
                if (pq.peek() < sum) {
                    pq.poll();
                    pq.add(sum);
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>(k);
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
	}
}
