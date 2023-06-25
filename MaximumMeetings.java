import java.util.* ;
import java.io.*; 
class Pair{
    int start;
    int end;
    int pos;
    public Pair(int start,int end,int pos)
    {
        this.start=start;
        this.end=end;
        this.pos=pos;
    }

}
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        Pair []p=new Pair[start.length];
        for(int i=0;i<start.length;i++)
        {
            p[i]=new Pair(start[i],end[i],i+1);
        }

        Arrays.sort(p,new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2)
            {
                return p1.end-p2.end;
            }
        });

        int count=1;
        
        int e=p[0].end;
        List<Integer> res=new ArrayList<>();
        res.add(p[0].pos);

        for(int i=1;i<p.length;i++)
        {
            if(p[i].start>e)
            {
                count++;
                e=p[i].end;
                res.add(p[i].pos);
            }
        }
        return res;
    }
}
