package a45;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/11/20 11:13
 */
public class Solution {

    public int jump(int[] nums) {
        int result=0;
        int index=0;
        int end=0;
        int max=0;
        while (index<nums.length){
            max=Math.max(index+nums[index],max);
            if(index==end){
                end=max;
                result++;
            }
            index++;
        }
        return result;
    }

    public int jump2(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int index=i;
            while (num+index<nums.length&&index<=num+i){
                dp[index]=Math.min(dp[i]+1,dp[index]);
                index++;
            }
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.jump(new int[]{2,3,1,1,4});
    }
}
