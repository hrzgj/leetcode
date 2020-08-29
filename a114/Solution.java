package a114;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2020/8/2 10:57
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
    private LinkedList<TreeNode> linkedList=new LinkedList<>();

    public void flatten(TreeNode root) {
        sds(root);
        root=linkedList.poll();
        TreeNode node=root;
        while (!linkedList.isEmpty()){
            node.right=linkedList.poll();
            node.left=null;
            node=node.right;
        }
    }


    private void sds(TreeNode root){
        if(root!=null){
            linkedList.add(root);
            sds(root.left);
            sds(root.right);
        }
    }
}
