import java.util.ArrayList;

public class Solution {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        ArrayList<Integer> list=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
            list.add(i);
        }
        list.add(n);
        k=k-1;
        String res="";
        while(true)
        {
            res=res+list.get(k/fact);
            list.remove(k/fact);
            if(list.size()==0)
                break;
            k=k%fact;
            fact=fact/list.size();
        }
        return res;
    }
}
