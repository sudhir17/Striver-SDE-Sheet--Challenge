import java.util.* ;
import java.io.*; 
/***************************************************************************

  Class for graph node is as follows:

  class graphNode {
      public int data;
      public ArrayList<graphNode> neighbours;

      graphNode() {
          data = 0;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val) {
          data = val;
          neighbours = new ArrayList<graphNode>();
      }

      graphNode(int val, ArrayList<graphNode> neighbours) {
          data = val;
          this.neighbours = neighbours;
      }
    }

******************************************************************************/

public class Solution {

    public static graphNode cloneGraph(graphNode node) {        

        graphNode noode=new graphNode(node.data,node.neighbours);

        return noode;

    }

}
