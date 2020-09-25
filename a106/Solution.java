package a106;

import java.util.HashMap;

/**
 * @author: chenyu
 * @date: 2020/9/25 9:39
 */
public class Solution {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    HashMap<Integer, Integer> map=new HashMap<>();
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        index=postorder.length-1;
        return dfs(inorder,postorder,0,inorder.length-1);
    }

    private TreeNode dfs(int[] inorder, int[] postorder,int left,int right) {
        if (left > right) {
            return null;
        }
        TreeNode node=new TreeNode(postorder[index]);
        Integer integer = map.get(node.val);
        index--;
        node.right=dfs(inorder,postorder,integer+1,right);
        node.left=dfs(inorder,postorder,0,integer-1);
        return node;
    }

}
