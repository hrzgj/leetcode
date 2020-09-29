package a145;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/29 11:22
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
    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        dfs(node.right);
        list.add(node.val);
    }
}
