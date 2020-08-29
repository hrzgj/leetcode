package a951;



/**
 * @author: chenyu
 * @date: 2020/7/27 21:46
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2!=null) {
            return false;
        }
        if(root1!=null&&root2==null){
            return false;
        }
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1.val == root2.val){
            if(flipEquiv(root1.left,root2.left)){
                return flipEquiv(root1.right,root2.right);
            }
            else if(flipEquiv(root1.left,root2.right)){
                return flipEquiv(root1.right,root2.left);
            }
        }
        return false;
    }


}
