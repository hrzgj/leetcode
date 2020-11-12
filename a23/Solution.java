package a23;

import com.sun.org.apache.bcel.internal.generic.LNEG;

/**
 * @author: chenyu
 * @date: 2020/11/12 9:59
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }
        return merge(lists,0,lists.length-1);
    }

    public ListNode merge(ListNode[] listNodes,int left,int right){
        if(left==right){
            return listNodes[left];
        }
        if(right<left){
            return null;
        }
        int mid=left+(right-left)>>1;
        return mergeTwo(merge(listNodes,left,mid),merge(listNodes,mid+1,right));
    }

    public ListNode mergeTwo(ListNode one,ListNode two){
        if(one==null||two==null){
            return one==null?two:one;
        }
        ListNode head=new ListNode();
        ListNode result=head;
        while (one!=null&&two!=null){
            if(one.val<=two.val){
                head.next=one;
                one=one.next;
            }else {
                head.next=two;
                two=two.next;
            }
            head=head.next;
        }
        head.next=one==null?two:one;
        return result.next;
    }














     public ListNode mergeKLists2(ListNode[] lists) {
         if(lists==null||lists.length==0){
             return null;
         }
         int length=lists.length;
         if(length==1){
             return lists[0];
         }
         ListNode listNode=new ListNode();
         ListNode result=listNode;
         while (true){
             ListNode temp=null;
             int min=Integer.MAX_VALUE;
             for (int i=0;i<length;i++) {
                 ListNode list=lists[i];
                 if(list==null){
                     continue;
                 }
                 if ( temp==null||list.val < temp.val) {
                     min = i;
                     temp = list;
                 }
             }
             if(min==Integer.MAX_VALUE){
                 return result.next;
             }
             listNode.next=temp;
             listNode=temp;
             lists[min]=lists[min].next;
         }
     }

}
