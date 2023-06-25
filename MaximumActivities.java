import java.util.*;
class Pair{

    int i;

    int j;

    Pair(int i, int j){

        this.i=i;

        this.j=j;

    }

}

public class Solution {

    public static int maximumActivities(List<Integer> start, List<Integer> end) {

        //Write your code here

        int count=1;

        List<Pair> arr=new ArrayList<>();

        for(int i=0;i<start.size();i++){

            arr.add(new Pair(start.get(i),end.get(i)));

        }

        Collections.sort(arr,(a,b)->a.j-b.j);

        

        int e=arr.get(0).j;

        for(int i=1;i<start.size();i++){

            if(arr.get(i).i>=e){

                e=arr.get(i).j;

                count++;

            }

        }

        return count;

    }

}
