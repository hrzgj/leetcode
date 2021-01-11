package a240;

/**
 * @author: chenyu
 * @date: 2021/1/11 15:19
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        if(n<=0){
            return false;
        }
        int left=0,right=matrix[0].length-1;
        while (left<n&&right>=0){
            if(matrix[left][right]>target){
                right--;
            }else if(matrix[left][right]<target){
                left++;
            }else {
                return true;
            }
        }
        return false;
    }
}
