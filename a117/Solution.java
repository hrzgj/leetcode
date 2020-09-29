package a117;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/9/28 11:19
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
public class Solution {
    public Node connect(Node root) {
        LinkedList<Node> linkedList=new LinkedList<>();
        linkedList.add(root);
        while (!linkedList.isEmpty()){
            int size=linkedList.size()-1;
            Node pre=linkedList.pop();
            if (pre.left != null) {
                linkedList.offer(pre.left);
            }
            if (pre.right != null) {
                linkedList.offer(pre.right);
            }
            while (size>0) {
                Node node = linkedList.pop();
                if (node.left != null) {
                    linkedList.offer(node.left);
                }
                if (node.right != null) {
                    linkedList.offer(node.right);
                }
                pre.next=node;
                pre=node;
                size--;
            }
            pre.next=null;
        }
        return root;
    }



}
