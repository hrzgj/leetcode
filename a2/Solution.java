package a2;

/**
 * @author: chenyu
 * @date: 2020/8/10 16:04
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ans=(l1.val+l2.val)/10;
        ListNode listNode=new ListNode((l1.val+l2.val)%10);
        ListNode result=listNode;
        while(l1!=null||l2!=null){
            l1= l1 != null ? l1.next : null;
            l2= l2 != null ? l2.next : null;
            int x=l1!=null?l1.val:0;
            int y=l2!=null?l2.val:0;
            if(x+y+ans==0&&l1==null&&l2==null){
                break;
            }
            ListNode node=new ListNode((x+y+ans)%10);
            ans=(x+y+ans)/10;
            listNode.next=node;
            listNode=listNode.next;
        }
        if(ans!=0){
            listNode.next=new ListNode(ans);
        }
        return result;
    }
}
