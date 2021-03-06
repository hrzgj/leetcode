package a503;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/6 10:26
 */
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Deque<Integer> deque=new LinkedList<>();
        Arrays.fill(res,-1);
        for(int i=0;i<2*n;i++){
            while (!deque.isEmpty() && nums[deque.peek()] <nums[i%n] ){
                res[deque.pop()]=nums[i%n];
            }
            deque.push(i%n);
        }
        return res;
    }
}
