package a724;

/**
 * @author: chenyu
 * @date: 2021/1/28 9:39
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(ans==sum-ans){
                return i;
            }
            ans+=nums[i];
        }
        return -1;
    }
}
