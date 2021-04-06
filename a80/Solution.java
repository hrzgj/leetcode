package a80;

/**
 * @author: chenyu
 * @date: 2020/12/4 11:11
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0,left=0,right=0;
        while(right<nums.length){
            int num=nums[left];
            while(right<nums.length && nums[right] ==num ){
                right++;
            }
            int size=(right-left)>=2?2:right-left;
            while(size-->0){
                nums[index++]=num;
            }
            left=right;
        }
        return index;
    }
}
