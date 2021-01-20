package a628;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/1/20 11:48
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[2],nums[n-2]*nums[n-3]*nums[n-1]);
    }
}
