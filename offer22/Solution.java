package offer22;

/**
 * @author: chenyu
 * @date: 2020/12/24 10:55
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node=head;
        while (k-->0){
            node=node.next;
        }
        while (node!=null){
            head=head.next;
            node=node.next;
        }
        return head;
    }
}
