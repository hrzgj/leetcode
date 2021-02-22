package a1438;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/2/22 21:47
 */
public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int right=0,left=0;
        int res=0;
        LinkedList<Integer> max=new LinkedList<>();
        LinkedList<Integer> min=new LinkedList<>();
        while (right<nums.length){
            while (!max.isEmpty()&&max.getLast()<nums[right]){
                max.removeLast();
            }
            while (!min.isEmpty() && min.getLast()>nums[right]){
                min.removeLast();
            }
            max.addLast(nums[right]);
            min.addLast(nums[right]);
            while (!max.isEmpty() && !min.isEmpty() && max.getFirst()-min.getFirst()>limit){
                if(nums[left]== max.getFirst()){
                    max.removeFirst();
                }
                if(nums[left]==min.getFirst()){
                    min.removeFirst();
                }
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }

    public int longestSubarray2(int[] nums, int limit) {
        int right=0,left=0;
        int res=0;
        LinkedList<Integer> max=new LinkedList<>();
        LinkedList<Integer> min=new LinkedList<>();
        while (right<nums.length){
            while(!max.isEmpty()&&nums[max.getLast()]<nums[right]){
                max.removeLast();
            }
            while(!min.isEmpty()&&nums[min.getLast()]>nums[right]){
                min.removeLast();
            }
            max.addLast(right);
            min.addLast(right);
            while (!max.isEmpty() &&!min.isEmpty() &&nums[max.getFirst()] - nums[min.getFirst()] > limit ){
                while (!max.isEmpty()&&max.getFirst()<left){
                    max.removeFirst();
                }
                while(!min.isEmpty()&&min.getFirst()<left){
                    min.removeFirst();
                }
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}
