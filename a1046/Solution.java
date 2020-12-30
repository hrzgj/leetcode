package a1046;

import java.util.PriorityQueue;

/**
 * @author: chenyu
 * @date: 2020/12/30 11:01
 */
public class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==0){
            return 0;
        }
        if(stones.length==1){
            return stones[0];
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>((o1,o2)-> o2-o1);
        for(int stone:stones){
            queue.add(stone);
        }
        while (queue.size()>1){
            int a= queue.poll();
            int b=queue.poll();
            if (a != b) {
                queue.add(Math.abs(a-b));
            }
        }
        return queue.size()==0?0:queue.poll();
    }
}
