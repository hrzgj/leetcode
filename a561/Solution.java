package a561;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/2/16 21:45
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }
}
