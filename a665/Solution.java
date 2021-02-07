package a665;

/**
 * @author: chenyu
 * @date: 2021/2/7 9:52
 */
public class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length < 3){
            return true;
        }
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                count++;
                if(count > 1){
                    break;
                }
                if(i >=1&&nums[i-1] > nums[i+1]){
                    nums[i+1] = nums[i];
                }else{
                    nums[i] = nums[i+1];
                }
            }
        }
        return count <= 1;
    }
}
