package a543;

/**
 * @author: chenyu
 * @date: 2020/12/23 9:47
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode treeNode){
        if(treeNode==null){
            return 0;
        }
        int left=dfs(treeNode.left);
        int right=dfs(treeNode.right);
        max=Math.max(left+right,max);
        return Math.max(left,right)+1;
    }
}
