package a5531;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/10/4 10:31
 */
public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int reuslt=-1;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(nums[nums.length-i-1]>=i){
                continue;
            }
            for(int j=nums.length-1;j>nums.length-1-i;j--){
                if(nums[j]>=i){
                    sum++;
                }
            }
            if(sum==i){
                reuslt=i;
                break;
            }
        }
        if(reuslt==-1){
            if(nums[0]>=nums.length){
                reuslt=nums.length;
            }
        }
        return reuslt;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.specialArray(new int[]{0,0});
    }
}
