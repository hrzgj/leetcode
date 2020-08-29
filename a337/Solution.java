package a337;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/8/5 11:16
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    public int rob(TreeNode root) {
        int[] result=find(root);
        return Math.max(result[0],result[1]);
    }

    public int[] find(TreeNode treeNode){
        if(treeNode==null){
            return new int[]{0,0};
        }
        int[] left=find(treeNode.left);
        int[] right=find(treeNode.right);
        return new int[]{left[1]+right[1]+treeNode.val,Math.max(left[0],left[1])+Math.max(right[0],right[1])};
    }

}
