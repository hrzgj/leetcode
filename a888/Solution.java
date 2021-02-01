package a888;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/2/1 8:41
 */
public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int a=0,b=0;
        for(int num:A){
            a+=num;
        }
        for(int num:B){
            b+=num;
        }
        Arrays.sort(B);
        int x=(b-a)/2;
        for(int num:A) {
            int nums=num+x;
            int left=0,right=B.length-1;
            while (left<=right){
                int mid=left+(right-left)/2;
                if(B[mid]>nums){
                    right=mid-1;
                }else if(B[mid]<nums){
                    left=mid+1;
                }else {
                    return new int[]{num,B[mid]};
                }
            }
        }
        return new int[0];

    }
}
