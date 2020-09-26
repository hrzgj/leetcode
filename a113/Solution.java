package a113;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/26 9:06
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null){
            return lists;
        }
        back(root,new LinkedList<>(),sum);
        return lists;
    }

    private void back(TreeNode node,List<Integer> list,int sum){
        if(node.left!=null&&node.right!=null&&sum==0){
            lists.add(new LinkedList<>(list));
            return;
        }
        list.add(node.val);
        if(node.left!=null){
            back(node.left,list,sum-node.val);
        }
        if(node.right!=null){
            back(node.right,list,sum-node.val);
        }


        list.remove(list.size()-1);

    }
}
