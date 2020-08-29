package a112;


/**
 * @author: chenyu
 * @date: 2020/7/7 19:24
 */
public class Solution {
      class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.val==sum&&root.left==null&&root.right==null){
            return true;
        }
        return hasPathSum(root.left,sum-root.val) ||hasPathSum(root.right,sum-root.val);
    }



}
