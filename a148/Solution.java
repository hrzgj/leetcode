package a148;

/**
 * @author: chenyu
 * @date: 2020/11/21 7:56
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head,quick=head.next;
        while (quick!=null&&quick.next!=null){
            slow=slow.next;
            quick=quick.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(temp);
        ListNode h=new ListNode();
        ListNode result=h;
        while (left!=null&&right!=null){
            if(left.val<right.val){
                h.next=left;
                h=left;
                left=left.next;
            }else {
                h.next=right;
                h=right;
                right=right.next;
            }
        }
        h.next=left==null?right:left;
        return result.next;
    }


    public ListNode sortList2(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode node=new ListNode();
        node.next=head;
        head=head.next;
        node.next.next=null;
        while (head!=null){
            int val=head.val;
            ListNode temp=node;
            while (temp.next!=null){
                if(temp.next.val>val){
                        break;
                }
                temp=temp.next;
            }
            ListNode next=head.next;
            head.next=temp.next;
            temp.next=head;
            head=next;

        }
        return node.next;
    }
}
