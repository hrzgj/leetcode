package offer53;

/**
 * @author: chenyu
 * @date: 2020/8/18 20:23
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==mid){
                left=mid;
            }else if(nums[mid]<mid){
                right=mid;
            }else {
                return mid;
            }
        }
        return nums[left];
    }

    public int search(int[] nums, int target) {
        // 搜索右边界 right
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        int right = i;
        // 若数组中无 target ，则提前返回
        if(j >= 0 && nums[j] != target) return 0;
        // 搜索左边界 right
        i = 0; j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        int left = j;
        return right - left - 1;
    }
}
