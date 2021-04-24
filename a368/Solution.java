package a368;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/4/24 9:27
 */
public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        int maxSize=1,maxVal=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if(nums[i] %nums[j]==0){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxVal = nums[i];
            }
        }
        List<Integer> list=new LinkedList<>();
        if(maxSize==1){
            list.add(nums[0]);
            return list;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if(dp[i]==maxSize &&maxVal%nums[i]==0){
                maxSize--;
                maxVal=nums[i];
                list.add(nums[i]);
            }
        }
        return list;
    }
}
