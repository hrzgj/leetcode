package offer32;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/27 15:32
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    LinkedList<TreeNode> list=new LinkedList<>();
    LinkedList<Integer> result=new LinkedList<>();
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        list.add(root);
        while (!list.isEmpty()){
            int size=list.size();
            while (size-->0){
                TreeNode node=list.pop();
                result.add(node.val);
                if(node.left!=null){
                    list.add(node.left);
                }
                if(node.right!=null){
                    list.add(node.right);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return new LinkedList<>();
        }
        list.add(root);
        while (!list.isEmpty()) {
            int size = list.size();
            List<Integer> temp = new LinkedList<>();
            while (size-- > 0) {
                TreeNode node = list.pop();
                temp.add(node.val);
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {
        LinkedList<TreeNode> list=new LinkedList<>();
        List<List<Integer>> result=new LinkedList<>();
        if(root==null){
            return new LinkedList<>();
        }
        int ans=1;
        list.add(root);
        while (!list.isEmpty()){
            int size=list.size();
            LinkedList<Integer> temp=new LinkedList<>();
            while (size-->0){
                TreeNode node=list.pop();
                if(ans%2==0){
                    temp.addFirst(node.val);
                }else {
                    temp.add(node.val);
                }
                if(node.left!=null){
                    list.add(node.left);
                }
                if(node.right!=null){
                    list.add(node.right);
                }
            }
            result.add(temp);
            ans++;
        }
        return result;
    }




}
