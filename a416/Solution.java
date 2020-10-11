package a416;

/**
 * @author: chenyu
 * @date: 2020/9/12 16:08
 */
public class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        if(sum==0){
            return true;
        }
        return back(nums,sum/2,0);
    }

    private boolean back(int[] nums,int target,int j){
        if(j>=nums.length){
            return false;
        }
        if(target==0){
            return  true;
        }
        if(target<0){
            return false;
        }
        boolean b=back(nums,target-nums[j],j+1);
        if(b){
            return true;
        }
        return    back(nums,target,j+1);
    }

    public boolean canPartition2(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int j = target; j >= num; --j) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }
}
