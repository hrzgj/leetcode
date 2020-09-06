package a107;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2020/9/6 8:23
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return null;
        }
        List<List<Integer>> lists=new LinkedList<>();
        LinkedList<TreeNode> nodes=new LinkedList<>();
        nodes.addLast(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> temp=new LinkedList<>();
            List<Integer> list=new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode treeNode = nodes.removeFirst();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    temp.addLast(treeNode.left);
                }
                if(treeNode.right!=null){
                    temp.addLast(treeNode.right);
                }
            }
            nodes.addAll(temp);
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
    }
}
