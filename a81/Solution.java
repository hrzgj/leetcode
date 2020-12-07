package a81;

/**
 * @author: chenyu
 * @date: 2020/12/6 15:49
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return true;
            }
            if(nums[left]<=nums[mid]){
                if(nums[left]<target&&nums[mid]>target){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }else {
                if(nums[mid]<target&&nums[right]>target){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.search(new int[]{1,3,5},1);
    }
}
