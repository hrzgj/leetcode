package a213;

/**
 * @author: chenyu
 * @date: 2021/1/12 10:19
 */
public class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int one=0,two=0;
        for(int i=0;i<nums.length-1;i++){
            int temp=Math.max(one+nums[i],two);
            one=two;
            two=temp;
        }
        int res=two;
        one=0;
        two=0;
        for(int i=1;i<nums.length;i++){
            int temp=Math.max(one+nums[i],two);
            one=two;
            two=temp;
        }
        return Math.max(res,two);
    }

}
