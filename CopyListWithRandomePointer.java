import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		LinkedListNode curr=head;
		while(curr!=null )
		{
			LinkedListNode newNode=new LinkedListNode(curr.data);
			newNode.next=curr.next;
			curr.next=newNode;
			curr=curr.next.next;
		}
		LinkedListNode itr=head;
		while(itr!=null)
		{
			if(itr.random!=null)
			itr.next.random=itr.random.next;
			itr=itr.next.next;
		}

		LinkedListNode dummy=new LinkedListNode(-1);
		itr=head;
		LinkedListNode temp=dummy;
		LinkedListNode next=null;
		while(itr!=null)
		{
			next=itr.next.next;
			temp.next=itr.next;
			itr.next=next;
			temp=temp.next;
			itr=next;

		}


		return dummy.next;
	}
}
