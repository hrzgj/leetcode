package interview0403;




import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/4/14 8:52
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree==null){
            return new ListNode[0];
        }
        LinkedList<ListNode> res=new LinkedList<>();
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        linkedList.add(tree);
        while (!linkedList.isEmpty()){
            int size=linkedList.size();
            ListNode node=new ListNode();
            ListNode head=node;
            while (size>0){
                size--;
                TreeNode treeNode=linkedList.poll();
                node.next=new ListNode(treeNode.val);
                node=node.next;
                if(treeNode.left!=null){
                    linkedList.offer(treeNode.left);
                }
                if(treeNode.right!=null){
                    linkedList.offer(treeNode.right);
                }
            }
            res.add(head.next);
        }
        return res.toArray(new ListNode[0]);
    }
}
