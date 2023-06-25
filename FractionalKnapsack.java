import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
		Arrays.sort(items,new Comparator<Pair>(){
			public int compare(Pair p1, Pair p2)
			{
				double d1=(double)p1.value/(double)p1.weight;
				double d2=(double)p2.value/(double)p2.weight;
				if(d1>d2)
					return -1;
				else if(d1<d2)
					return 1;
				else 
					return 0;
			}
		});
		
		double ans=0;
		for(int i=0;i<items.length;i++)
		{
			if(w>=items[i].weight)
			{
				ans=ans+items[i].value;
				w=w-items[i].weight;
			}
			else 
			{
				ans=ans+items[i].value/(double)items[i].weight*(double)w;
				break;
			}
			
		}
		return ans;

			
    }
}

