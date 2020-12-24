package offer21;

/**
 * @author: chenyu
 * @date: 2020/12/24 10:46
 */
public class Solution {
    public int[] exchange(int[] nums) {
        int left=0,right=nums.length-1;
        while (left<right){
            while (nums[left]%2!=0){
                left++;
            }
            while (nums[right]%2==0){
                right--;
            }
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}
