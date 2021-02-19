package a1004;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/2/19 10:31
 */
public class Solution {
    public int longestOnes(int[] A, int K) {
        int left=0,right=0,count=0;
        int res=0;
        while (right<A.length){
            if(A[right]==0){
                count++;
            }
            while (count>K){
                if(A[left++]==0) {
                    count--;
                }
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
