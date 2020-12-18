package a102;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2020/12/18 10:35
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return lists;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new LinkedList<>();
            while (size-->0){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
