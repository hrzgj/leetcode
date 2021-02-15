package a485;

/**
 * @author: chenyu
 * @date: 2021/2/15 19:22
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0,temp=0;
        for(int num:nums){
            if(num==1){
                temp++;
            }else{
                res=Math.max(res,temp);
                temp=0;
            }
        }
        res=Math.max(res,temp);
        return res;
    }
}
