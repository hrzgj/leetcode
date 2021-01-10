package offer25;

/**
 * @author: chenyu
 * @date: 2021/1/10 10:10
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode res=head;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                head.next=l1;
                head=l1;
                l1=l1.next;
            }else {
                head.next=l2;
                head=l2;
                l2=l2.next;
            }
        }
        head.next=l1==null?l2:l1;
        return res.next;
    }
}
