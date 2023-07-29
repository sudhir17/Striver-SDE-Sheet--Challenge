import java.util.* ;
import java.io.*; 
public class Solution {
    public static void func(int ind,String s,List<List<String>> list,List<String> temp)
    {
        if(ind==s.length())
        {
            list.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=ind;i<s.length();i++)
        {
            if(isPalindrom(s,ind,i))
            {
                temp.add(s.substring(ind,i+1));
                func(i+1,s,list,temp);
                temp.remove(temp.size()-1);
            }
        }

    }
    public static boolean isPalindrom(String s,int i,int j)
    {
        for(int k=i,l=j;k<l;k++,l--)
        {
            if(s.charAt(k)!=s.charAt(l))
                return false;
        }
        return true;
    }
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> list=new ArrayList<>();
        List<String> temp=new ArrayList<>();
         func(0,s,list,temp);
         return list;
    }
}
