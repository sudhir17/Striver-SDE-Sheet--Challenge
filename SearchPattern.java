import java.util.*;
public class Solution {
    public static List< Integer > stringMatch(String s, String p){
        // Write your code here.
        int m=s.length(),n=p.length();
        	// if(m>n)
			// return new ArrayList<>();
		int i=0,j=0;
        List<Integer> list=new ArrayList<>();
		while(j<p.length())
			j++;
		
		
		while(j<=s.length())
		{
		
				if(p.equals(s.substring(i,j)))
                {
                    list.add(i+1);
                }
				i++;
				j++;
		}
		return list;
    }
}
