package a144;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/27 9:17
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
    List<Integer> list=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        list.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
