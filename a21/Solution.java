package a21;

/**
 * @author: chenyu
 * @date: 2020/9/17 20:42
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode listNode;
        if(l1.val<=l2.val){
            listNode=l1;
            l1=l1.next;
        }else {
            listNode=l2;
            l2=l2.next;
        }
        ListNode result=listNode;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                listNode.next=l1;
                l1=l1.next;
                listNode=listNode.next;
            }else {
                listNode.next=l2;
                l2=l2.next;
                listNode=listNode.next;
            }
        }
        if(l1!=null){
            listNode.next=l1;
        }
        if(l2!=null){
            listNode.next=l2;
        }
        return result;
    }
}
