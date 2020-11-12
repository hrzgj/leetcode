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
        ListNode node=new ListNode();
        node.next=head;
        ListNode one=node,two=node.next,three=two.next;
        while (true){
            one.next=three;
            two.next=three.next;
            three.next=two;
            if(two.next==null){
                break;
            }
            one=two;
            two=one.next;
            three=two.next;
            if(three==null){
                break;
            }
        }
        return node.next;
    }
}

