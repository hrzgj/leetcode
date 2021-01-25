package offer52;

/**
 * @author: chenyu
 * @date: 2021/1/25 9:25
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        while (a!=b){
            if(a.next==null&&b.next==null){
                return null;
            }
            if(a.next==null){
                a=headB;
            }else {
                a=a.next;
            }
            if(b.next==null){
                b=headA;
            }else {
                b=b.next;
            }
        }
        return a;
    }
}
