package a24;

/**
 * @author: chenyu
 * @date: 2020/10/13 10:29
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode listNode=new ListNode();
        listNode.next=head;
        ListNode pre=head,tail=pre.next,node=tail.next;
        while (node.next!=null){
            listNode.next=tail;
            pre.next=tail.next;
            tail.next=pre;
            
            listNode=tail;
            pre=pre.next;
            tail=pre.next;
            node=tail.next;
        }
        return head;
    }
}

