import java.util.* ;
import java.io.*; 
public class Solution {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
          long sum = 0;

        

        int maxTime = Integer.MIN_VALUE;

 

        // We will iterate through all the chapters and calculate the sum. 

        for (int i = 0; i < m; i++) {

            sum += time[i];

            maxTime = Math.max(maxTime , time[i]);

        }

 

        // We will initialize the lower limit of binary search l with 1 and the upper limit of binary search with sum.

        long l = maxTime, r = sum, answer = sum;

        while (l <= r) {

            

            long mid = (l + r) / 2;

            long days = 1;

            long currentTime = 0;

            for (int i = 0; i < m; i++) {

                currentTime += time[i];

                if (currentTime > mid) {

                    days++;

                    currentTime = time[i];

                }

 

            }

 

            /*

                If the days required to study all the chaptes is greater than n than answer is not possible

                and we want more time to study in a given day so we will compress the range to the right hand side.

                Else we can study all the chapters and we will update the answer with mid.

            */

            if (days <= n) {

                answer = mid;

                r = mid - 1;

            }

 

            else {

                l = mid + 1;

            }

 

        }

 

        // We will return the final answer.

        return answer;
    }
}
