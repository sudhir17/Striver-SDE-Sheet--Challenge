import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        for(int i=0;i<mat.size();i++)
        {
            int ind=Collections.binarySearch(mat.get(i), target);
            if(ind>=0)
                return true;
        }
        return false;
    }
}
