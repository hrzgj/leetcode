package a234;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/23 8:57
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> linkedList=new ArrayList<>();
        while (head!=null){
            linkedList.add(head.val);
            head=head.next;
        }
        int left=0,right=linkedList.size()-1;
        while (left<=right){
            if(!linkedList.get(left).equals(linkedList.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
