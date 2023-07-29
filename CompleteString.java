import java.util.* ;
import java.io.*; 

class Solution {

  public static String completeString(int n, String[] a) {
    // Write your code here.
    HashSet<String> set=new HashSet<>();
    for(int i=0;i<a.length;i++)
      set.add(a[i]);
    int max=Integer.MIN_VALUE;
    String ans="";
    for(int i=0;i<a.length;i++)
    {
        String s=a[i];
        String res="";
        int j=0;
        for( j=0;j<s.length();j++)
        {
           res=res+s.charAt(j);
           if(!set.contains(res))
            break;
        }
        if(j==s.length() && res.length()>=max)
        {
             max=res.length();
                ans=res;

       }
    }
    if(ans.length()==0)
      return "None";
    return ans;
  }
}
