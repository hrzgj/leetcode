package offer26;


import javax.print.attribute.standard.NumberUp;
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
    public boolean isSubStructure2(TreeNode A, TreeNode B) {
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

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return A!=null&&B!=null&&(finds(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }

    private boolean finds(TreeNode a,TreeNode b){
        if(b==null){
            return true;
        }
        if(a==null){
            return false;
        }
        if(a.val!=b.val){
            return false;
        }
        return finds(a.left,b.left)&&finds(a.right,b.right);
    }




}
