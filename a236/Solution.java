package a236;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/12/21 9:34
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    Set<TreeNode> set=new HashSet<>();
    Map<Integer,TreeNode>map=new HashMap<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while (p!=null){
            set.add(p);
            p=map.get(p.val);
        }
        while (q!=null){
            if(set.contains(q)){
                return q;
            }
            q=map.get(q.val);
        }
        return root;
    }

    private void dfs(TreeNode node){
        if(node.left!=null){
            map.put(node.left.val,node);
            dfs(node.left);
        }
        if(node.right!=null){
            map.put(node.right.val,node);
            dfs(node.right);
        }
    }
}
