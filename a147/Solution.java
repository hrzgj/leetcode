package a147;

/**
 * @author: chenyu
 * @date: 2020/11/20 9:19
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode node=new ListNode(Integer.MIN_VALUE);
        node.next=head;
        node.next.next=null;
        head=head.next;
        while (head!=null){
            ListNode temp=node;
            while (temp.next!=null){
                if(temp.next.val>head.val){
                    break;
                }else {
                    temp=temp.next;
                }
            }
            ListNode listNode=head.next;
            head.next=temp.next;
            temp.next=head;
            head=listNode;
        }
        return node.next;
    }
}
