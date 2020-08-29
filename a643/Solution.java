package a643;

/**
 * @author: chenyu
 * @date: 2020/8/18 20:51
 */
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int res = Integer.MIN_VALUE, temp = 0;
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
            if(i >= k - 1){
                if(i == k - 1){
                    temp = nums[i];
                }else{
                    temp = nums[i] - nums[i - k];
                }
            }
            res = Math.max(res, temp);
        }

        return res * 1.0 / k;

    }
    public double findMaxAverage2(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++) {
            sum+=nums[i];
        }
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum);
        }
        return res/k;
    }

}
