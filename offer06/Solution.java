package offer06;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/18 20:14
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    private List<Integer> list=new LinkedList<>();
    public int[] reversePrint(ListNode head) {
        back(head);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void back(ListNode head){
        if(head==null){
            return;
        }
        back(head.next);
        list.add(head.val);
    }
}
