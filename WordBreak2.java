import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static void func(String s,ArrayList<String> dictionary, ArrayList<String> res,String str)
	{
		if(s.equals(""))
		{
			res.add(str.trim());
			return;
		}
			
		
		for(int i=0;i<s.length();i++)
		{
			String prefix=s.substring(0,i+1);
			String suffix=s.substring(i+1);
			if(dictionary.contains(prefix))
			{
				func(suffix,dictionary,res,str+" "+prefix);
			}
		}
	}
	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
		ArrayList<String> list=new ArrayList<>();
		func(s,dictionary,list,"");
		return list;
	}
}
