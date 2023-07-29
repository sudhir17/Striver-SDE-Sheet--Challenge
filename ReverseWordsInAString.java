import java.util.*;
public class Solution 
{
	public static String reverseString(String s) 
	{
     s += " ";
    Stack<String> st = new Stack<String>();
    int i;
    String str = "";
    for (i = 0;i < s.length();i++)
    {
        if (s.charAt(i) == ' '&&str.length()>0)
        {
            st.push(str.trim());
            str = "";
        }
        else
        {
            str += s.charAt(i);
        }
    }
    String ans = "";
    while (st.size() != 1)
    {
        ans += st.peek().trim() + " ";
        st.pop();
    }
    ans += st.peek(); // The last word should'nt have a space after it
    //System.out.println("After reversing words: ");
 return ans;
	}
}
