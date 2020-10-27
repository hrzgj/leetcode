package offer37;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/27 16:14
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        LinkedList<TreeNode> list=new LinkedList<>();
        StringBuilder result=new StringBuilder();
        if (root == null) {
            return "";
        }
        list.add(root);
        while (!list.isEmpty()) {
            int size = list.size();
            while (size-- > 0) {
                TreeNode node = list.pop();
                if(node==null){
                    result.append("null,");
                }else {
                    result.append(node.val).append(",");
                    list.add(node.left);
                    list.add(node.right);
                }
            }
        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] datas=data.split(",");
        TreeNode root=new TreeNode(Integer.valueOf(datas[0]));
        LinkedList<TreeNode> list=new LinkedList<TreeNode>(){{add(root);}};
        int index=1;
        while (!list.isEmpty()){
            TreeNode node=list.pop();
            if(!"null".equals(datas[index])){
                node.left=new TreeNode(Integer.valueOf(datas[index]));
                list.add(node.left);
            }
            index++;
            if(!"null".equals(datas[index])){
                node.right=new TreeNode(Integer.valueOf(datas[index]));
                list.add(node.right);
            }
        }
        return root;
    }
}
