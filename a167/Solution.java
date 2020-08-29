package a167;

/**
 * @author: chenyu
 * @date: 2020/7/20 10:38
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        while (left<=right){
            int temp=numbers[left]+numbers[right];
            if(temp>target){
                right--;
            }else if(temp==target){
                return new int[]{left+1,right+1};
            }else {
                left++;
            }
        }
        return new int[0];
    }
}
