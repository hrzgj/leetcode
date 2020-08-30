package a53;

import java.security.interfaces.RSAKey;

/**
 * @author: chenyu
 * @date: 2020/8/30 15:31
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        int result=sum[0];
        for(int i=0;i<sum.length;i++){
            if(sum[i]>result){
                result=sum[i];
            }
            for(int j=0;j<i;j++){
                if(sum[i]-sum[j]>result){
                    result=sum[i]-sum[j];
                }
            }
        }
        return result;
    }
}
