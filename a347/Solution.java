package a347;

import java.util.*;

import static java.util.Comparator.comparingInt;

/**
 * @author: chenyu
 * @date: 2020/9/7 12:52
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int integer:nums){
            if(map.containsKey(integer)){
                map.put(integer,map.get(integer)+1);
            }else {
                map.put(integer,1);
            }
        }
        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int count=entry.getValue();
            if(queue.size()==k) {
                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }
            }
            else {
                queue.offer(new int[]{num,count});
            }
        }
        int[] result=new int[k];
        while (!queue.isEmpty()){
            result[k-queue.size()]=queue.poll()[0];
        }
        return result;
    }
}
