package offer36;

/**
 * @author: chenyu
 * @date: 2021/1/21 13:59
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
public class Solution {
    Node pre=null,head;
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        dfs(root);
        head.left=pre;
        pre.right=head;
        return head;
    }

    private void dfs(Node node){
        if(node==null){
            return;
        }
        dfs(node.left);
        if(pre==null){
            head=node;
        }else {
            pre.right=node;
        }
        node.left=pre;
        pre=node.left;
        dfs(node.right);
    }

}
