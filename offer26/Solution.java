package offer26;


import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/27 10:03
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    List<TreeNode> list=new LinkedList<>();
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B==null){
            return false;
        }
        find(A,B.val);
        for(TreeNode node:list){
            if(check(node,B)){
                return true;
            }
        }
        return false;

    }

    private void find(TreeNode A,int val){
        if(A==null){
            return;
        }
        if(A.val==val) {
            list.add(A);
        }
        find(A.left,val);
        find(A.right,val);

    }

    private boolean check(TreeNode A, TreeNode B){
        if(A==null&&B!=null){
            return false;
        }
        if(A == null){
            return true;
        }
        if (B == null) {
            return true;
        }
        if(A.val!=B.val){
            return false;
        }
        if(check(A.left,B.left)){
            return check(A.right,B.right);
        }
        return false;
    }


}
