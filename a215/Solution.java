package a215;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/6/29 10:06
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
