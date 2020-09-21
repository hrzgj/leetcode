package a538;

import java.util.Random;

/**
 * @author: chenyu
 * @date: 2020/9/21 20:55
 */
 class TreeNode {
          int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node){
        if(node==null){
            return ;
        }
        dfs(node.right);
        sum+=node.val;
        node.val=sum;
        dfs(node.left);



    }
}
