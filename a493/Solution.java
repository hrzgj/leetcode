package a493;

/**
 * @author: chenyu
 * @date: 2020/11/28 9:04
 */
public class Solution {
    public int reversePairs(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+1)/2>nums[j]){
                    result++;
                }
            }
        }
        return result;

    }
}
