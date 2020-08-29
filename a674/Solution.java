package a674;

/**
 * @author: chenyu
 * @date: 2020/8/18 20:42
 */
public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null){
            return 0;
        }
        int result=0;
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                temp++;
            }else {
                result=Math.max(result,temp);
            }
        }
        result=Math.max(result,temp);
        return result;
    }
}
