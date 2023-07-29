import java.util.*;
public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		   List<Integer> list = new ArrayList<>();

        int n = matrix.size();

        int m = matrix.get(0).size();

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                list.add(matrix.get(i).get(j));

            }

        }

        Collections.sort(list);

        int index = list.size()/2;

        return list.get(index);
	}
}
