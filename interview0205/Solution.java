package interview0205;

import utils.ListNode;

/**
 * @author: chenyu
 * @date: 2021/4/15 9:13
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;//求两个节点相加的值
            carry = sum / 10;//取进位的值
            prev.next = new ListNode(sum % 10);//sum对10求余后放到节点中
            prev = prev.next;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        return head.next;
    }
}
