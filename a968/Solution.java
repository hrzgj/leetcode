package a968;

import javax.annotation.Resource;

/**
 * @author: chenyu
 * @date: 2020/9/22 20:12
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    int reuslt=0;
    public int minCameraCover(TreeNode root) {
        find(root);
        return reuslt;
    }
    int find(TreeNode node){
        if(node==null){
            return 1;
        }
        int left=find(node.left);
        int right=find(node.right);
        if(left==0||right==0){
            reuslt++;
            return 2;
        }else if(left==2&&right==2){
            return 1;
        }else if(left+right>=3){
            return 1;
        }else if(left==1&&right==1){
            return 0;
        }
        return -1;

    }

}
