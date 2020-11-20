package a283;

/**
 * @author: chenyu
 * @date: 2020/11/19 9:04
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int zero=0;
        int index=0;
        while (index<n){
            if(nums[index]!=0){
                nums[zero++]=nums[index];
            }
            index++;
        }
        while (zero<n){
            nums[zero++]=0;
        }
    }
}
