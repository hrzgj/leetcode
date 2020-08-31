package a198;

/**
 * @author: chenyu
 * @date: 2020/8/31 14:28
 */
public class Solution {
    public int rob(int[] nums) {
        int one=0,two=0,three=0;
        for(int i=0;i<nums.length;i++){
            three=Math.max(one+nums[i],two);
            one=two;
            two=three;
        }
        return two;
    }
}
