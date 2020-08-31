package offer42;

/**
 * @author: chenyu
 * @date: 2020/8/31 14:39
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int result=Integer.MIN_VALUE;
        int sum=0;
        for(Integer  num:nums){
            if(sum<=0){
                sum=num;
            }else{
                sum+=num;
            }
            result=Math.max(result,sum);
        }
        return result;
    }
}
