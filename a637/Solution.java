package a637;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/12 15:55
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null){
            return new LinkedList<>();
        }
        LinkedList<TreeNode> linkedList=new LinkedList<TreeNode>();
        List<Double> list=new LinkedList<>();
        linkedList.add(root);
        while (!linkedList.isEmpty()){
            int size=linkedList.size();
            int d=size;
            long sum=0;
            while (size>0){
                size--;
                TreeNode node=linkedList.pop();
                sum+=node.val;
                if(node.left!=null){
                    linkedList.add(node.left);
                }
                if(node.right!=null){
                    linkedList.add(node.right);
                }
            }
            list.add(sum*1.0/d);
        }
        return list;
    }
}
