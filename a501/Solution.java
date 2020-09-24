package a501;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/24 9:07
 */
public class Solution {
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }

    int sum=1;
    int best=1;
    List<Integer> list=new ArrayList<>();
    TreeNode pre;
    public int[] findMode(TreeNode root) {
        dfs(root);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        if(pre!=null&&node.val==pre.val){
            sum++;
        }else {
            sum=1;
        }
        if(sum>best){
            best=sum;
            list.clear();
            list.add(node.val);
        }else if(sum==best){
            list.add(node.val);
        }
        pre=node;
        dfs(node.right);

    }
}
