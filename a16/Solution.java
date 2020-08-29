package a16;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author: chenyu
 * @date: 2020/6/24 9:40
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        int abs = 10000;
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int num = nums[i];
            if (num > target) {
                break;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = num + nums[left] + nums[right];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < abs) {
                    result = sum;
                    abs = Math.abs(sum - target);
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
