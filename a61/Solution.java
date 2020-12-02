package a61;

/**
 * @author: chenyu
 * @date: 2020/12/1 9:53
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode quick=head;
        int length=0;
        while (quick.next!=null){
            quick=quick.next;
            length++;
        }
        quick.next=head;
        k=length-length%k-1;
        quick=head;
        while (k>0){
            quick=quick.next;
            k--;
        }
        head=quick.next;
        quick.next=null;
        return head;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode node=new ListNode(0);
        node.next=new ListNode(1);
        node.next.next=new ListNode(2);
        solution.rotateRight(node,6);
    }
}
