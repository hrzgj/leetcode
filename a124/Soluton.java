package a124;

/**
 * @author: chenyu
 * @date: 2020/6/21 10:38
 */
public class Soluton {

    int max;
    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    public int maxPathSum(TreeNode root) {
        if(root!=null){
            max=root.val;
        }
        maxSum(root);
        return max;
    }

    private int maxSum(TreeNode root){
        if(root==null){
            return 0;
        }
        //如果贡献值大于0，才计入
        int left=Math.max(maxSum(root.left),0);
        int right=Math.max(maxSum(root.right),0);
        //此处判断以该节点为根的左路径和右路径的和，判断是不是最大值
        int result=left+right+root.val;
        if(result>max){
            max=result;
        }
        //返回节点的左路径和右路径，哪个的值更大
        return root.val+Math.max(left,right);
    }

}
