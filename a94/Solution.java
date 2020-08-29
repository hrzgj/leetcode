package a94;


import java.util.LinkedList;
import java.util.List;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
/**
 * @author: chenyu
 * @date: 2020/8/13 20:51
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        List<Integer> list=new LinkedList<>();
        LinkedList<TreeNode> nodes=new LinkedList<>();
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        while (root!=null){
            while (root.left!=null&&!linkedList.contains(root.left)) {
                nodes.push(root);
                root = root.left;
            }
            list.add(root.val);
            linkedList.add(root);
            if(root.right!=null){
                root=root.right;
                continue;
            }
            if(!nodes.isEmpty()){
                root=nodes.pop();
            }else {
                break;
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=null;
        treeNode.right=new TreeNode(2);
        treeNode.right.left=new TreeNode(3);
        solution.inorderTraversal(treeNode);
    }
}
