package a109;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenyu
 * @date: 2020/8/18 14:48
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    ArrayList<Integer> arrayList;
    public TreeNode sortedListToBST(ListNode head) {
        arrayList=new ArrayList<>();
        while (head!=null){
            arrayList.add(head.val);
            head=head.next;
        }
        return dfs(0,arrayList.size()-1);
    }

    private TreeNode dfs(int left, int right){
        if(left>right){
            return null;
        }
        if(left==right){
            return new TreeNode(arrayList.get(left));
        }
        int mid=(left+right)/2;
        TreeNode treeNode=new TreeNode(arrayList.get(mid));
        treeNode.left=dfs(left,mid-1);
        treeNode.right=dfs(mid+1,right);
        return treeNode;
    }


}
