package a80;

/**
 * @author: chenyu
 * @date: 2020/12/4 11:11
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(i>0&&nums[i]==nums[i-1]){
                count++;
            }
            if(count==2){
                count=0;
                i++;
            }
            nums[j++]=nums[i];
        }
        return j;
    }
}
