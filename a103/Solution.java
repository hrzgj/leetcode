package a103;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/22 8:54
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> lists=new LinkedList<>();
        if(root==null){
            return lists;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            LinkedList<Integer> list=new LinkedList<>();
            while (size-->0){
                TreeNode node=queue.poll();
                if(lists.size()%2==0) {
                    list.add(node.val);
                }else {
                    list.addFirst(node.val);
                }
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
