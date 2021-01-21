package offer35;


import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/1/21 13:47
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node node=head;
        while (head!=null){
            map.put(head,new Node(head.val));
            head=head.next;
        }
        head=node;
        while (node!=null){
            map.get(node).next=map.get(node.next);
            map.get(node).random=map.get(node.random);
            node=node.next;
        }
        return map.get(head);

    }
}
