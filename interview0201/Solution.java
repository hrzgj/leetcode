package interview0201;

/**
 * @author: chenyu
 * @date: 2020/6/26 10:39
 */
public class Solution {
     static class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }

    public ListNode removeDuplicateNodes(ListNode head) {
         if(head==null){
             return null;
         }
         ListNode listNode=head.next;
         ListNode before=head;
        while (listNode!=null){
            ListNode node=head;
            boolean sign=false;
            while (node!=listNode){
                if(node.val==listNode.val){
                    before.next=listNode.next;
                    sign=true;
                    break;
                }else {
                    node=node.next;
                }
            }
            if(sign){
                listNode=listNode.next;
            }else {
                before=before.next;
                listNode=listNode.next;
            }
        }
        return head;
    }
}
