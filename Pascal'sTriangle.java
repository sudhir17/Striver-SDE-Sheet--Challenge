import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> list=new ArrayList<>();
				 
				for(int i=0;i<n;i++)
				{
					list.add(new ArrayList<>());
				}
				list.get(0).add(1L);
				for(int i=1;i<n;i++)
				{
					list.get(i).add(1L);
					for(int j=1;j<list.get(i-1).size();j++)
					{
						Long temp=list.get(i-1).get(j-1)+list.get(i-1).get(j);
						list.get(i).add(temp);
					}
					list.get(i).add(1L);
				}
				return list;
	}
}
