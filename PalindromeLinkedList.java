import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode  reverse(LinkedListNode head)
	{
		LinkedListNode prev=null,curr=head,next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here!
		 if(head==null || head.next==null)
            return true;
		LinkedListNode<Integer> slow=head,fast=head;
		while(fast!=null && fast.next!=null )
		{
			slow=slow.next;
			fast=fast.next.next;
		}

		slow=reverse(slow);
		//slow=slow.next;
		fast=head;
		while(slow!=null)
		{
			if(!slow.data.equals(fast.data))
			//if(slow.data!=fast.data)
				return false;
			slow=slow.next;
			fast=fast.next;
		}
		return true;

	}
}
