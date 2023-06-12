/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node slow=firstHead,fast=secondHead;
        while(true)
        {
            if(slow==fast)
                break;
            slow=slow.next;
            fast=fast.next;
            if(slow==null)
                slow=secondHead;
            if(fast==null)
                fast=firstHead;
        }
        if(slow!=null)
            return slow.data;
        return -1;
    }
}
