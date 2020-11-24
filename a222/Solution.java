package a222;

/**
 * @author: chenyu
 * @date: 2020/11/24 8:51
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left==null||root.right==null){
            return 2;
        }
        return countNodes(root.left)+countNodes(root.right)+1;

    }

}
