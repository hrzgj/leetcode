package a99;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/8/8 9:23
 */
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
    TreeNode x=null;
    TreeNode y=null;
    TreeNode temp=null;
    public void recoverTree(TreeNode root) {
        dps(root);
        if(x!=null&&y!=null) {
            int z = x.val;
            x.val = y.val;
            y.val = z;
        }
    }

    private void dps(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        dps(treeNode.left);
        if(temp==null){
            temp=treeNode;
        }else {
            if(temp.val>treeNode.val){
                y=treeNode;
                if(x==null){
                    x=temp;
                }
            }
            temp=treeNode;
        }
        dps(treeNode.right);
    }
}
