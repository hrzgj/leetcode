package a92;

/**
 * @author: chenyu
 * @date: 2020/12/14 13:48
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node=head;
        ListNode pre=null;
        int length=n-m;
        while(m>=2){
            pre=node;
            node=node.next;
            m--;
        }
        ListNode tail=node.next;
        while(length>=1){
            length--;
            ListNode third=tail.next;
            tail.next=node;
            node=tail;
            tail=third;
        }
        if(pre!=null){
            pre.next.next=tail;
            pre.next=node;
        }else {
            head=node;
        }

        return head;

    }
}
