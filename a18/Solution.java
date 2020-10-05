package a18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/5 9:55
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                return list;
            }
            if (nums[i] + nums[nums.length - 3] + nums[nums.length - 2] + nums[nums.length - 1] < target) {
                continue;
            }
            int first=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1&&nums[j-1]==nums[j]){
                    continue;
                }
                int left=j+1,right=nums.length-1;
                while (left<right){
                    int sum=first+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(first);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        list.add(temp);
                        while(left < right && nums[left+1] == nums[left]) ++left;
                        ++left;
                        while (left < right && nums[right-1] == nums[right]) --right;
                        --right;
                    }else if(sum>target){
                        right--;
                    }else {
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
