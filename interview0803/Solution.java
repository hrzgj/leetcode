package interview0803;

/**
 * @author: chenyu
 * @date: 2020/7/31 10:26
 */
public class Solution {
    public int findMagicIndex(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(i==nums[i]){
                return i;
            }
            if(i>nums[i]){
                i++;
            }
            if(i<nums[i]){
                i=nums[i];
            }
        }
        return -1;
    }
}
