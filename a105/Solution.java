package a105;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/12/1 22:05
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {

    Map<Integer,Integer> map=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        return dfs(preorder,inorder,0,n-1,0,n-1);
    }

    private TreeNode dfs(int[] preorder, int[] inorder,int preLeft,int preRight,int inLeft,int inRight){
        if(preLeft>preRight){
            return null;
        }
        int rootIndex=map.get(preorder[preLeft]);
        int size=rootIndex-inLeft;
        TreeNode root=new TreeNode(preorder[preLeft]);
        root.left=dfs(preorder,inorder,preLeft+1,preLeft+size,inLeft,rootIndex);
        root.right=dfs(preorder,inorder,preLeft+size+1,preRight,rootIndex+1,rootIndex);
        return root;
    }
}
