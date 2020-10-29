package interview0409;

import java.text.DateFormatSymbols;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/27 22:34
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    List<List<Integer>> lists=new LinkedList<>();
    List<Integer> res=new LinkedList<>();
    public List<List<Integer>> BSTSequences(TreeNode root) {
        if(root==null){
            lists.add(res);
            return lists;
        }
        HashSet<TreeNode> beenVisit=new HashSet<TreeNode>();
        beenVisit.add(root);
        dfs(beenVisit);
        return lists;
    }

    private void dfs(HashSet<TreeNode> nodes){
        if(nodes.size()==0){
            lists.add(new LinkedList<>(res));
            return;
        }
        HashSet<TreeNode> set=new HashSet<>(nodes);
        for(TreeNode node:nodes){
            if(node.left!=null){
                set.add(node.left);
            }
            if(node.right!=null){
                set.add(node.right);
            }
            res.add(node.val);
            set.remove(node);
            dfs(set);
            set.add(node);
            if(node.left!=null){
                set.remove(node.left);
            }
            if(node.right!=null){
                set.remove(node.right);
            }
            res.remove(res.size()-1);
        }
    }
}
