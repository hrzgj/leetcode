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
}
