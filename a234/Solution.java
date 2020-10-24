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

    public static void main(String[] args) {
        int x1=1290,x2=1290;
        Integer x=129;
        Integer y=129;
        System.out.println(x1==x2);
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}
