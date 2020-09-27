package a235;

/**
 * @author: chenyu
 * @date: 2020/9/27 10:22
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root.val>q.val&&root.val>p.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(root.val>p.val&&root.val<q.val){
            return root;
        }
        return root;
    }


}
