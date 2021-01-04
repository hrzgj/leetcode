package a287;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/5/26 21:05
 */
public class Solution {
    public int findDuplicate2(int[] nums) {
        int[] temp=new int[nums.length];
        for (int num : nums) {
            temp[num-1] ++;
        }
        int i;
        for( i=0;i<temp.length;i++){
            if(temp[i]>=2){
                break;
            }
        }
        return i+1;
    }

    public int findDuplicate(int[] nums) {
        int left=1,right=nums.length;
        while (left<right){
            int mid=left+(right-left)/2;
            int res=0;
            for(int num:nums){
                if(num<=mid){
                    res++;
                }
            }
            if(res>mid){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left;
    }

}


