package a27;

/**
 * @author: chenyu
 * @date: 2020/11/13 11:52
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        if(length<=0){
            return 0;
        }
        int index=0;
        for(int i=0;i<length;i++){
            if(nums[i]==val){
                continue;
            }else {
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
