package a300;

/**
 * @author: chenyu
 * @date: 2020/9/4 15:13
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        int result=0;
        for(int i=1;i<nums.length;i++){
            int maxj=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) {
                    maxj=Math.max(dp[j],maxj);
                }
            }
            dp[i]=maxj+1;
            result=Math.max(dp[i],result);
        }
        return result;
    }


}
