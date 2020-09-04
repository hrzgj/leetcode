package a257;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/9/4 14:45
 */
class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    List<String> list=new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return list;
        }
        if(root.left==null&&root.right==null){
            list.add(String.valueOf(root.val));
            return list;
        }
        dfs(root.left,new StringBuilder().append(root.val));
        dfs(root.right,new StringBuilder().append(root.val));
        return list;
    }

    private void dfs(TreeNode treeNode,StringBuilder stringBuffer){
        if(treeNode==null){
            return;
        }
        if(treeNode.left==null&&treeNode.right==null){
            stringBuffer.append("->").append(treeNode.val);
            list.add(stringBuffer.toString());
            return;
        }
        stringBuffer.append("->").append(treeNode.val);
        dfs(treeNode.left,stringBuffer);
        dfs(treeNode.right,new StringBuilder().append(stringBuffer));
    }
}
