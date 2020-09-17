package a19;

import java.util.ArrayList;

/**
 * @author: chenyu
 * @date: 2020/9/17 20:24
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        ListNode listNode=head;
        ListNode tail=head;
        while (n>0){
            n--;
            listNode=listNode.next;
        }
        while (listNode.next!=null){
            listNode=listNode.next;
            tail=tail.next;
        }
        tail.next=tail.next.next;
        return head;
    }
}
