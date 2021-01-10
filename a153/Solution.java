package a153;

/**
 * @author: chenyu
 * @date: 2021/1/10 11:59
 * [3,4,5,1,2]
 * [4,5,6,7,0,1,2]
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
                break;
            }
        }
        return nums[right];
    }
}
