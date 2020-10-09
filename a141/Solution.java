package a141;

/**
 * @author: chenyu
 * @date: 2020/10/9 9:32
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
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode listNode=head.next;
        while (listNode!=null&&listNode.next!=null&&head!=null&&head!=listNode){
            head=head.next;
            listNode=listNode.next.next;
            if(head==listNode){
                return true;
            }
        }
        return false;
    }
}
