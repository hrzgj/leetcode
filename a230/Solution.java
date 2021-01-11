package a230;



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
/**
 * @author: chenyu
 * @date: 2021/1/11 10:16
 */
public class Solution {
    Integer res=null;
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;

    }

    private void   dfs(TreeNode root){
        if(res!=null){
            return;
        }
        if(k==0){
            res=root.val;
            return;
        }
        if(root.left!=null) {
            dfs(root.left);
        }
        k--;
        if(root.right!=null){
            dfs(root.right);
        }

    }
}
