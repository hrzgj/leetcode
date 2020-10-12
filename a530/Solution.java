package a530;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/12 12:26
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int result=Integer.MAX_VALUE,pre=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return result;
    }

    private void dfs(TreeNode node){
        if(node.left!=null) {
            dfs(node.left);
        }
        if(pre==Integer.MAX_VALUE){
            pre=node.val;
        }else {
            result = Math.min(node.val-pre, result);
            pre = node.val;
        }
        if(node.right!=null){
            dfs(node.right);
        }
    }

}
