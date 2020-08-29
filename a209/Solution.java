package a209;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/6/28 9:46
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int before=0,end=0;
        int index=Integer.MAX_VALUE;
        int sum=0;
        while (end<nums.length){
            sum+=nums[end];
            while (sum>=s){
                index=Math.min(index,end-before+1);
                sum-=nums[before];
                before++;
            }
            end++;
        }
        if(index==Integer.MAX_VALUE){
            return 0;
        }
        return index;
    }
}
