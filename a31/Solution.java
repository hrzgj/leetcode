package a31;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/9/23 10:19
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i;
        for(i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                break;
            }
        }
        i--;
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        int j;
        for(j=i+1;j<n;j++){
            if(nums[j]<=nums[i]){
                break;
            }
        }
        int temp=nums[i];
        nums[i]=nums[j-1];
        nums[j-1]=temp;
        Arrays.sort(nums,i+1,n);

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.nextPermutation(new int[]{1,5,1});
    }
}
