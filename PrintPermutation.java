import java.util.* ;
import java.io.*; 
public class Solution {
    public static void func(int ind,char arr[],List<String> list)
    {
        if(ind==arr.length)
        {
            list.add(new String(arr));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            swap(arr,i,ind);
            func(ind+1,arr,list);
            swap(arr,i,ind);
        }
    }
    public static void swap(char arr[],int i,int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static List<String> findPermutations(String s) {
        // Write your code here.
        char arr[]=s.toCharArray();
        List<String> list=new ArrayList<>();
        func(0,arr,list);
        return list;
    }
}
