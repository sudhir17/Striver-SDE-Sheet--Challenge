import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static void func(int ind,int sum,ArrayList<Integer> arr,int target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans)
    {
        if(sum==target)
            ans.add(new ArrayList<>(list));
        for(int i=ind;i<arr.size();i++)
        {
            if(i!=ind && arr.get(i)==arr.get(i-1))
                continue;
            list.add(arr.get(i));
            func(i+1,sum+arr.get(i),arr,target,list,ans);
            list.remove(list.size()-1);
        }
    } 
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Collections.sort(arr);
        func(0,0,arr,target,new ArrayList<>(),ans);
        return ans;
        //    Write your code here.
    }
}
