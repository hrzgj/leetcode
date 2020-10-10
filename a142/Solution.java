package a142;

/**
 * @author: chenyu
 * @date: 2020/10/10 9:22
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode node=head,pre=head;
        boolean cycle=false;
        while (pre.next!=null&&node.next.next!=null){
            pre=pre.next;
            node=node.next.next;
            if(pre==node){
                cycle=true;
                break;
            }
        }
        if(cycle){
            while (pre!=head){
                head=head.next;
                pre=pre.next;
            }
            return pre;
        }else {
            return null;
        }
    }
}
