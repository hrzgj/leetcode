package a128;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/6/6 21:11
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int temp=1;
        int result=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                temp++;
            }else if(nums[i]==nums[i-1]){
                continue;
            }
            else {
                if(temp>result){
                    result=temp;
                }
                temp=1;
            }
        }
        if(temp>result){
            result=temp;
        }
        return result;
    }
}
