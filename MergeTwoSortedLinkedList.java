import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode temp=new LinkedListNode(-1);
        LinkedListNode node=temp;
        while(first!=null && second!=null)
        {
            if(first.data<second.data)
            {
                temp.next=new LinkedListNode(first.data);
                temp=temp.next;
                first=first.next;
            }
            else {
                temp.next=new LinkedListNode(second.data);
                temp=temp.next;
                second=second.next;
            }
        }
        if(first!=null)
        {
            temp.next=first;
        }
        if(second!=null)
        {
            temp.next=second;
        }
        return node.next;

	}
}
