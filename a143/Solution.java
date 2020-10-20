package a143;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/20 9:23
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        ArrayList<ListNode> linkedList=new ArrayList<>();
        ListNode node=head;
        while (node!=null){
            linkedList.add(node);
            node=node.next;
        }
        int n=linkedList.size()-1;
        int i=0;
        while (i<n){
            linkedList.get(i).next=linkedList.get(n);
            i++;
            linkedList.get(n).next=linkedList.get(n);
            n--;
        }
        linkedList.get(i).next=null;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        solution.reorderList(node);
    }
}
