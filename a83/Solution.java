package a83;

/**
 * @author: chenyu
 * @date: 2020/12/7 9:58
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=new ListNode(0);
        node.next=head;
        ListNode listNode=head;
        head=head.next;
        while (head!=null){
            if(head.val==listNode.val){
                head=head.next;
                continue;
            }
            listNode.next=head;
            listNode=head;
            head=head.next;
        }
        return node.next;
    }
}
