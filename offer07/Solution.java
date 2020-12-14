package offer07;

import java.util.HashMap;

/**
 * @author: chenyu
 * @date: 2020/10/26 21:31
 */
class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    HashMap<Integer, Integer> hashMap=new HashMap<>();
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        for(int i=0;i<inorder.length;i++){
            hashMap.put(inorder[i],i);
        }
        return back(preorder,0,0,preorder.length-1);
    }

    private TreeNode back(int[] preorder, int index,int start,int end){
        if(start>end){
            return null;
        }
        int val=preorder[index];
        TreeNode node=new TreeNode(val);
        int i=hashMap.get(val);
        node.left=back(preorder,index+1,start,i-1);
        node.right=back(preorder,index+i+1-start,i+1,end);
        return node;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hashMap.put(inorder[i],i);
        }
        return dfs(preorder,0,0,inorder.length);
    }

    private TreeNode dfs(int[] preorder,int index,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode node=new TreeNode(preorder[start]);
        int i=hashMap.get(preorder[index]);
        node.left=dfs(preorder,index+1,start,i-1);
        node.right=dfs(preorder,index+i+1-start,i+1,end);
        return node;
    }
}
