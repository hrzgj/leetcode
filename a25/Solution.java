package a25;

/**
 * @author: chenyu
 * @date: 2020/11/12 15:58
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {

      public ListNode reverseKGroup(ListNode head, int k) {
             ListNode result=new ListNode();
             result.next=head;
             ListNode node=result;
             while (head!=null){
                    ListNode tail=node;
                    for(int i=1;i<=k;i++){
                        tail=tail.next;
                        if(tail==null){
                            return result.next;
                        }
                    }
                    ListNode[] listNodes = reversal(node.next, tail);
                    node.next=listNodes[0];
                    node=listNodes[1];
             }
             return result.next;
     }

     public ListNode[] reversal(ListNode head,ListNode tail){
            ListNode headNode=head;
            ListNode node=tail.next;
            while (head!=tail){
                ListNode listNode=head.next;
                head.next=node;
                node=head;
                head=listNode;
            }

            return new ListNode[]{tail,headNode};
     }
}
