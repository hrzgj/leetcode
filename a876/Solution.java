package a876;

/**
 * @author: chenyu
 * @date: 2021/3/21 9:37
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node=head,quick=head.next;
        while (quick.next!=null&&quick.next.next!=null){
            quick=quick.next.next;
            node=node.next;
        }
        return node.next;
    }
}
