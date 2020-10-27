package a1365;



/**
 * @author: chenyu
 * @date: 2020/10/26 11:03
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    result[i]++;
                }
            }
        }
        return result;

    }
}
