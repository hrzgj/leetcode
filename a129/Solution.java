package a129;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/29 9:55
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    int result=0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return result;
    }

    private void dfs(TreeNode node,int sum){
        if(node==null){
            return;
        }
        if(node.left==null&&node.right==null){
            result+=sum*10+node.val;
            return;
        }
        dfs(node.left,sum*10+node.val);
        dfs(node.right,sum*10+node.val);

    }


}
