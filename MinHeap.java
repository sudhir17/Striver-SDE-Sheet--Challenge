import java.util.* ;
import java.io.*; 

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // for(int i=0;i<q.length;i++)
        //     System.out.println(Arrays.toString(q[i]));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<q.length;i++)
        {
            if(q[i].length==1)
                list.add(pq.poll());
            else {
                pq.add(q[i][1]);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<res.length;i++)
            res[i]=list.get(i);
            return res;
        // Write your code here.

    }
}
