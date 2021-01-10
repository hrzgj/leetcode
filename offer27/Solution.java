package offer27;

/**
 * @author: chenyu
 * @date: 2021/1/10 10:35
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=root.left;
        root.left=root.right;
        root.right=left;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
