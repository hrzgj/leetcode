package a108;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/7/3 9:55
 */
public class Solution {
      class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;    public TreeNode sortedArrayToBST(int[] nums) {
              int mid=nums.length/2;
              if(mid==0){
                  if(nums.length==0){
                      return null;
                  }
                  return new TreeNode(nums[0]);
              }
              TreeNode treeNode=new TreeNode(nums[mid]);
              int[] left= Arrays.copyOfRange(nums,0,mid);
              int[] right=Arrays.copyOfRange(nums,mid+1,nums.length);
              treeNode.left=sortedArrayToBST(left);
              treeNode.right=sortedArrayToBST(right);
              return treeNode;
          }
      TreeNode(int x) { val = x; }
      }


}
