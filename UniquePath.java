import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        ArrayList<Integer> res=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
        int count=(int)Math.floor(arr.size()/3);
        for(int i=0;i<arr.size();i++)
        {
            if(map.containsKey(arr.get(i)))
            {
                map.put(arr.get(i),map.get(arr.get(i))+1);
                
            }
            else 
                map.put(arr.get(i),1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(m.getValue()>count)
                res.add(m.getKey());
        }
        
        
         return res;     
        // Write your code here.
    }
}
