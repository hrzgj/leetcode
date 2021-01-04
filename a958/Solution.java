package a958;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/1/3 20:33
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root==null){
            return true;
        }
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()){
            int size=list.size();
            while (size-->0){
                TreeNode node=list.pollFirst();
                if(node==null){
                    while (!list.isEmpty()){
                        TreeNode poll = list.poll();
                        if(poll!=null){
                            return false;
                        }
                    }
                    return true;
                }
                list.add(node.left);
                list.add(node.right);
            }
        }
        return true;
    }

}
