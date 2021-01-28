package offer59;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2021/1/28 10:07
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            while (!queue.isEmpty() && queue.peekFirst()<nums[i]){
                queue.pollFirst();
            }
            queue.offerFirst(nums[i]);
        }
        res[0]=queue.peekLast();
        for(int i=k;i<n;i++){
            while (!queue.isEmpty() && queue.peekFirst()<nums[i]){
                queue.pollFirst();
            }
            queue.offerFirst(nums[i]);
            if(queue.peekLast()==nums[i-k]){
                queue.pollLast();
            }
            res[i-k+1]=queue.peekLast();
        }
        return res;
    }
}
