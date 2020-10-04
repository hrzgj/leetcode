package a5532;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/4 10:46
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
    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        boolean result=true;
        int odd=0;
        if(root==null){
            return false;
        }
        linkedList.add(root);
        while (!linkedList.isEmpty()&&result){
            int size=linkedList.size();
            int pre=odd%2==0?Integer.MIN_VALUE:Integer.MAX_VALUE,now;
            while (size>0){
                size--;
                TreeNode node=linkedList.pop();
                now= node.val;
                if(odd%2==0){
                    if(now%2==0||now<=pre){
                        result=false;
                        break;
                    }
                }else {
                    if(now%2!=0||now>=pre){
                        result=false;
                        break;
                    }
                }
                if(node.left!=null){
                    linkedList.add(node.left);
                }
                if(node.right!=null){
                    linkedList.add(node.right);
                }
                pre=now;
            }
            odd++;
        }
        return result;
    }
}
