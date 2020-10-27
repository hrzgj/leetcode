package offer28;


import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/27 10:26
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public boolean isSymmetric2(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode treeNode=new TreeNode(Integer.MAX_VALUE);
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            List<Integer> temp=new LinkedList<>();
            int size=list.size();
            while (size-->0){
                TreeNode node=list.pop();
                temp.add(node.val);
                if(node.left==null){
                    list.add(treeNode);
                }else {
                    list.add(node.left);
                }
                if(node.right==null){
                    list.add(treeNode);
                }else {
                    list.add(node.right);
                }
            }
            int left=0,right=temp.size()-1;
            while (left<right){
                if(!temp.get(left).equals(temp.get(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return check(root.left,root.right);
    }
    private boolean check(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null||left.val!=right.val) return false;
        return check(left.left,right.right)&& check(left.right,right.left);
    }
}
