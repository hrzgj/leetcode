package a152;

/**
 * @author: chenyu
 * @date: 2020/12/18 10:44
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][2];
        if(n==1){
            return nums[0];
        }
        if(nums[0]<0){
            dp[0][1]=nums[0];
        }else {
            dp[0][0]=nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                dp[i][0]=dp[i-1][1]*nums[i];
                dp[i][1]=Math.min(dp[i-1][0]*nums[i],nums[i]);
            }else {
                dp[i][0]=Math.max(dp[i-1][0]*nums[i],nums[i]);
                dp[i][1]=dp[i-1][1]*nums[i];
            }
        }
        int res=-1;
        for(int[] r:dp){
            res=Math.max(res,r[0]);
        }
        return res;
    }
}
