package a437;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/2/4 10:19
 */
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        int i=helper(root, map, sum, 0);
        return i;
    }

    int helper(TreeNode root, HashMap<Integer, Integer> map, int sum, int pathSum){
        int res = 0;
        if(root == null) return 0;

        pathSum += root.val;
        res += map.getOrDefault(pathSum - sum, 0);
        map.put(pathSum, map.getOrDefault(pathSum, 0) + 1);
        res += helper(root.left, map, sum, pathSum) + helper(root.right, map, sum, pathSum);
        map.put(pathSum, map.get(pathSum) - 1);
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        TreeNode node=new TreeNode(10);
        node.left=new TreeNode(1);
        node.right=new TreeNode(3);
        solution.pathSum(node,14);
    }

}
