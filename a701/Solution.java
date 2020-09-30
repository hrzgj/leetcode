package a701;

/**
 * @author: chenyu
 * @date: 2020/9/30 10:40
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        dfs(root,root,val);
        return root;
    }
    private void dfs(TreeNode root,TreeNode node,int val){
        if(node==null){
            if(root.val>val){
                root.left=new TreeNode(val);
            }else{
                root.right=new TreeNode(val);
            }
            return;
        }
        if(node.val>val){
            dfs(node,node.left,val);
        }else{
            dfs(node,node.right,val);
        }
    }
}
