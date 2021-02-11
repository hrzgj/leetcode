package a703;

import java.util.PriorityQueue;

/**
 * @author: chenyu
 * @date: 2021/2/11 10:50
 */
public class KthLargest {
    PriorityQueue<Integer> queue=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int num:nums){
            add(num);
        }

    }

    public int add(int val) {
        queue.add(val);
        if(queue.size()>k){
            queue.poll();
        }
        return queue.peek();
    }
}
