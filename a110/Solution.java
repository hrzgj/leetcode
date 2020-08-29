package a110;

import java.util.HashMap;

/**
 * @author: chenyu
 * @date: 2020/8/17 9:43
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    public boolean isBalanced(TreeNode root) {
        return dfs(root)>=0;
    }

    private int dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=dfs(node.left);
        int right=dfs(node.right);
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        String s="123";
        int a=s.hashCode();
        int b=a&16;
        System.out.println(Integer.toBinaryString(b));
    }
}
