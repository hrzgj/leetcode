package a5607;

import sun.applet.Main;

/**
 * @author: chenyu
 * @date: 2020/11/22 11:05
 */
public class Solution {
    public int waysToMakeFair(int[] nums) {
        int oddSum = 0, evenSum = 0;
        int[] odd = new int[nums.length];
        int[] even = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
            odd[i] = oddSum;
            even[i] = evenSum;
        }
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int newOdd;
            int newEven;
            if (i % 2 == 0) {
                newOdd = oddSum - odd[i+1] + even[i+1];
                newEven = evenSum - nums[i] - even[i+1] + odd[i+1];
            } else {
                newOdd = oddSum - nums[i] - odd[i+1] + even[i+1];
                newEven = evenSum - even[i+1] + odd[i+1];
            }
            if (newOdd == newEven) {
                result++;
            }
        }
        if((nums.length-1)%2==0&&evenSum-nums[nums.length-1]==oddSum){
            result++;
        }
        if((nums.length-1)%2!=0&&evenSum==oddSum-nums[nums.length-1]){
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.waysToMakeFair(new int[]{1,1,1});
    }
}