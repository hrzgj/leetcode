package offer54;

/**
 * @author: chenyu
 * @date: 2020/10/27 17:23
 */
 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
     int size;
     int result=Integer.MAX_VALUE;
    public int kthLargest(TreeNode root, int k) {
        size=k;
        dfs(root);
        return result;
    }

    private void dfs(TreeNode node){
        if(result==Integer.MAX_VALUE) {
            if (node.right != null) {
                dfs(node.right);
            }
            size--;
            if (size == 0) {
                result = node.val;
                return;
            }
            if(node.left !=null){
                dfs(node.left);
            }
        }


    }

}
