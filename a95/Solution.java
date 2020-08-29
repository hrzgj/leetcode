package a95;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/7/21 9:09
 */

public class Solution {
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

    public List<TreeNode> generateTrees(int n) {
        if(n<=0){
            return new ArrayList<>();
        }
        return get(1,n);
    }

    public List<TreeNode> get(int start,int end){
        List<TreeNode> treeNodes=new LinkedList<>();
        if(start>end){
            treeNodes.add(null);
            return treeNodes;
        }
        if(start==end){
            treeNodes.add(new TreeNode(start));
            return treeNodes;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> left=get(start,i-1);
            List<TreeNode> right=get(i+1,end);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode treeNode=new TreeNode(i);
                    treeNode.left=l;
                    treeNode.right=r;
                    treeNodes.add(treeNode);
                }
            }
        }
        return treeNodes;

    }
}
