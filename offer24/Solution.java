package offer24;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
/**
 * @author: chenyu
 * @date: 2021/1/10 10:05
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=null;
        while (true){
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            if(temp==null){
                break;
            }
            head=temp;
        }
        return head;
    }
}
