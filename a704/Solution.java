package a704;

/**
 * @author: chenyu
 * @date: 2020/10/28 17:07
 */
public class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)>>>1;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]==target){
                return mid;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
}
