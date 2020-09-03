package interview1617;

/**
 * @author: chenyu
 * @date: 2020/9/1 20:39
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int sum=Integer.MIN_VALUE;
        int result=Integer.MIN_VALUE;
        for (int num : nums) {
            if (sum <= 0) {
                sum =num;
            } else {
                sum +=num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
