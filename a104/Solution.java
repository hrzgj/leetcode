package a104;



/**
 * @author: chenyu
 * @date: 2020/7/28 10:04
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=maxDepth(root.left)+1;
        int right=maxDepth(root.right)+1;
        return Math.max(left,right);
    }
}
