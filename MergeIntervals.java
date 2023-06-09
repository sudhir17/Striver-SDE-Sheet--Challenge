import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
       Arrays.sort(intervals,new Comparator<Interval>(){
          public int compare(Interval i1,Interval i2)
           {
               return i1.start-i2.start;
           }
       });
        List<Interval> res=new ArrayList<Interval>();
     //  for(int i=0;i<intervals.length;i++)
       // System.out.println(intervals[i].start+" "+intervals[i].finish);
       int s=intervals[0].start;
       int e=intervals[0].finish;
       for(int i=1;i<intervals.length;i++)
       {
           if(e<intervals[i].start)
           {
               res.add(new Interval(s,e));
               s=intervals[i].start;
               e=intervals[i].finish;
           }
           else{
               e=Math.max(e,intervals[i].finish);
           }
       }
        res.add(new Interval(s,e));
        return res;
    }
}
