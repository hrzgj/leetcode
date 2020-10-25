package a845;

/**
 * @author: chenyu
 * @date: 2020/10/25 9:16
 */
public class Solution {
    public int longestMountain(int[] A) {
        if(A.length<3){
            return 0;
        }
        int result=0;
        int length=A.length;
        for(int i=1;i<length;i++){
            int left=i,right=i;
            while (left>0&&A[left-1]<A[left]){
                left--;
            }
            while (right<length-1&&A[right]>A[right+1]){
                right++;
            }
            if(left==i||right==i){
                continue;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
    }


}
