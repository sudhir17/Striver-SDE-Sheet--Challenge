/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node merge(Node head1,Node head2)
    {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        Node temp=new Node(-1);
        Node node=temp;
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data)
            {
                temp.child=new Node(head1.data);
                temp=temp.child;
                head1=head1.child;
            }
            else {
                temp.child=new Node(head2.data);
                temp=temp.child;
                head2=head2.child;
            }
        }
        if(head1!=null)
        {
            temp.child=head1;
        }
        if(head2!=null)
        {
            temp.child=head2;
        }
        return node.child;
    }
    public static Node flattenLinkedList(Node head) {
        //Write your code here
        // if(head1==null)
        //     return head2;
        // if(head2==null)
        //     return head1;


        Node dummy=new Node(-1);
        Node temp=dummy;
        Node node=head;
        while(node!=null)
        {
            // temp=merge(node,temp);
            // node=node.next;
            temp.child=merge(node,temp.child);
            //temp=temp.child;
            node=node.next;
        }   
        
             
        return temp.child;

    }
}
