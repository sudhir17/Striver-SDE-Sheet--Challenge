import java.util.* ;
import java.io.*; 
public class Solution {
    public static void func(int ind,int arr[],ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans)
    {
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++)
        {
            if(i!=ind && arr[i]==arr[i-1])
                continue;
            list.add(arr[i]);
            func(i+1,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
  public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        func(0,arr,new ArrayList<Integer>(),ans);
        return ans;
    }

}
