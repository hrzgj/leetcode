package a111;

/**
 * @author: chenyu
 * @date: 2020/8/21 8:01
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public int minDepth(TreeNode root) {

        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left!=null&&root.right==null){
            return minDepth(root.left);
        }
        if(root.left == null){
            return minDepth(root.right);
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
