package offer33;

/**
 * @author: chenyu
 * @date: 2021/1/21 13:22
 */
public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder,0,postorder.length);
    }

    private boolean dfs(int[] postorder,int left,int right){
        if(left>=right){
            return true;
        }
        int mid=left;
        while (postorder[mid]<postorder[right]){
            mid++;
        }
        int temp=mid;
        while (temp<right){
            if(postorder[temp++]<postorder[right]){
                return false;
            }
        }
        return dfs(postorder,left,mid-1)&&dfs(postorder,mid,right);
    }
}
