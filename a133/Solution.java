package a133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/12 9:22
 */
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class Solution {

    private HashMap<Integer,Node> map=new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        Node node1=new Node(node.val);
        map.put(node.val,node1);
        List<Node> nodes=new ArrayList<>();
        for(Node a:node.neighbors){
            if(map.containsKey(a.val)){
                nodes.add(map.get(a.val));
                continue;
            }
            nodes.add(cloneGraph(a));
        }
        node1.neighbors=nodes;
        return node1;
    }

}
