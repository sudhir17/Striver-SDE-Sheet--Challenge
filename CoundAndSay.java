import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static String func(String str)
    {
        String res="";
        int count=1;
        char ch=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(ch==str.charAt(i))
                count++;
            else 
            {
                res=res+count+ch;
                ch=str.charAt(i);
                count=1;
            }
        }
        res=res+count+ch;
        // System.out.println(res);
        return res;
    }
    public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        String res="1";
        for(int i=1;i<n;i++)
        {
            res=func(res);
           
        }
        return res;
    }
}
