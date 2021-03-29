package a173;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/28 14:21
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
public class BSTIterator {
    LinkedList<Integer> list=new LinkedList<>();
    Iterator<Integer> iterator;
    public BSTIterator(TreeNode root) {
        dfs(root);
        iterator=list.iterator();
    }

    private void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
