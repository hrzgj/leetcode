package a26;

/**
 * @author: chenyu
 * @date: 2020/11/13 11:07
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        int temp=nums[0];
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp){
                continue;
            }else {
                nums[index]=nums[i];
                temp=nums[index];
                index++;
            }
        }
        return index+1;
    }
}

