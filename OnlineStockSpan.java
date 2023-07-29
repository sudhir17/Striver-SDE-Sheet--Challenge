import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int count=1;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<price.size();i++)
        {
            while(!stack.isEmpty() && price.get(i)>=price.get(stack.peek()))
                stack.pop();
            int res=stack.isEmpty()?i+1:i-stack.peek();
            list.add(res);
            stack.push(i);
        }
       // list.add(stack.size());
        return list;
    }
}
