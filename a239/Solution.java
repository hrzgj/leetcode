package a239;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/1/2 14:13
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            while (!queue.isEmpty()&&nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        res[0]=nums[queue.peekFirst()];
        for(int i=k;i<n;i++){
            while (!queue.isEmpty()&&nums[i]>=nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            while (!queue.isEmpty()&&queue.peekFirst()<i-k){
                queue.pollFirst();
            }
            res[i-k+1]=nums[queue.peekFirst()];
        }
        return res;
    }
}
