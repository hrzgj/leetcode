package a154;

/**
 * @author: chenyu
 * @date: 2020/7/22 9:26
 */
public class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else if(nums[mid]<nums[right]){
                right=mid;
            }else if(nums[mid]==nums[right]){
                right--;
            }
        }
        if(right==-1){
            return nums[0];
        }
        return nums[right];
    }
}
