package a164;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/11/26 9:25
 */
public class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int result=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            result=Math.max(result,nums[i]-nums[i-1]);
        }
        return result;
    }
}
