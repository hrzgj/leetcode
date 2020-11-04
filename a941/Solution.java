package a941;

/**
 * @author: chenyu
 * @date: 2020/11/3 10:22
 */
public class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3){
            return false;
        }
        int left=0,right=A.length-1;

        while (left<A.length-1&&A[left]<=A[left+1]){
            if(A[left]==A[left+1]){
                return false;
            }
            if(left<A.length-1&&A[left]<A[left+1]){
                left++;
            }
        }
        while (right>0&&A[right]<=A[right-1]) {
            if (A[right] == A[right - 1]) {
                return false;
            }
            if (A[right] < A[right - 1]) {
                right--;
            }
        }
        if(left==0||right==A.length-1){
            return false;
        }
        return left==right;
    }
}
