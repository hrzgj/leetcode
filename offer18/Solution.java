package offer18;

/**
 * @author: chenyu
 * @date: 2020/12/24 10:42
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head==null){
            return head;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode node=head;
        while(node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
                break;
            }
            node=node.next;
        }
        return head;
    }
}
