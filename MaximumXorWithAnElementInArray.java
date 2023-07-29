import java.util.*;

 

class Node{

    Node[] links = new Node[2];

 

    boolean containsKey(int key){

        return links[key] != null;

    }

 

    Node get(int key){

        return links[key];

    }

 

    void put(int key, Node node){

        links[key] = node;

    }

}

 

class Trie{

    private static Node root;

 

    Trie(){

        this.root = new Node();

    }

 

    public static void insert(int num){

        Node node = root;

        for(int i=31; i>=0; i--){

            int bit = (num >> i) & 1;

            if(!node.containsKey(bit)){

                node.put(bit, new Node());

            }

            node = node.get(bit);

        }

    }

 

    public int getXOR(int num){

        Node node = root;

        int max = 0;

 

        for(int i=31; i>=0; i--){

            int bit = (num >> i) & 1;

            if(node.containsKey(1 - bit)){

                max = max | (1 << i);

                node = node.get(1 - bit);

            }

            else node = node.get(bit);

        }

 

        return max;

    }

}

 

public class Solution {

    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {

        Collections.sort(arr); 

        

        ArrayList<ArrayList<Integer>> offlineQueries = new ArrayList<ArrayList<Integer>>(); 

        int m = queries.size(); 

        for(int i = 0;i<m;i++) {

            ArrayList<Integer> temp = new ArrayList<Integer>(); 

            temp.add(queries.get(i).get(1)); 

            temp.add(queries.get(i).get(0)); 

            temp.add(i); 

            offlineQueries.add(temp); 

        }

        

        Collections.sort(offlineQueries, new Comparator<ArrayList<Integer>> () {

            @Override

            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {

                return a.get(0).compareTo(b.get(0));

            }

        });

         

        int ind = 0;

        int n = arr.size(); 

        Trie trie = new Trie(); 

        ArrayList<Integer> ans = new ArrayList<Integer>(m); 

        for(int i = 0;i<m;i++) ans.add(-1); 

        for(int i = 0;i<m;i++) {

            while(ind<n && arr.get(ind) <= offlineQueries.get(i).get(0)) {

                 trie.insert(arr.get(ind)); 

                 ind++; 

            }

            int queryInd = offlineQueries.get(i).get(2); 

            if(ind != 0) ans.set(queryInd, trie.getXOR(offlineQueries.get(i).get(1)));

            else ans.set(queryInd, -1); 

        }

         

        return ans; 

    }

}
