import java.util.*;
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] nums) {
	  HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Pair> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            list.add(new Pair(key,value));
        }
        Collections.sort(list,new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return b.b-a.b;
            }
        });
        int[]ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).a;
        }
        return ans;
	}

}
