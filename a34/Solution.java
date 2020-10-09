package a34;

/**
 * @author: chenyu
 * @date: 2020/10/9 9:45
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]==target){
                break;
            }else {
                left=mid+1;
            }
        }
        if(left<=right){
            left=right=(left+right)/2;
            while (nums[left]==target){
                left--;
            }
            while (nums[right]==target){
                right++;
            }
            return new int[]{left+1,right-1};
        }else {
            return new int[]{-1,-1};
        }
    }
}
