package a82;

/**
 * @author: chenyu
 * @date: 2020/12/6 16:09
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(Integer.MIN_VALUE);
        ListNode listNode = head;
        while (listNode.next != null) {
            if (node.next.val == listNode.next.val) {
                while (listNode.next != null && node.next.val == listNode.next.val) {
                    listNode = listNode.next;
                }
                node.next = listNode.next;
                listNode = listNode.next;
            } else {
                node = node.next;
                listNode = listNode.next;
            }
        }
        return head;

    }
}
