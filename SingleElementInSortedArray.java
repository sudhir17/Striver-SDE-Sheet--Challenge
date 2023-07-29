import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
         int res=arr.get(0);
        for(int i=1;i<arr.size();i++)
            res=res^arr.get(i);
        return res;
        //    Write your code here.
    }
}
