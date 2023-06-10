import java.io.*;
import java.util.* ;

/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        LinkedListNode temp=node;
        LinkedListNode prev=node;
        while(temp.next!=null)
        {
            
           temp.data=temp.next.data;
           prev=temp;
           temp=temp.next;
        }
        prev.next=null;
	}
}
