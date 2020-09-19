package a404;

/**
 * @author: chenyu
 * @date: 2020/9/19 9:07
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,false);
        return sum;
    }

    private void dfs(TreeNode node,boolean left){
        if(node.left==null&&node.right==null&&left){
            sum+=node.val;
            return;
        }
        if (node.left != null) {
            dfs(node.left,true);
        }
        if (node.right != null) {
            dfs(node.right,false);
        }

    }
}
