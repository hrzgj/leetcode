package a35;

/**
 * @author: chenyu
 * @date: 2020/7/17 9:54
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;
        int left=0,right=length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
}
