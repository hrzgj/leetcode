package a995;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2021/2/18 9:59
 */
public class Solution {
    public int minKBitFlips(int[] A, int K) {
        Queue<Integer> queue=new LinkedList<>();
        int n=A.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(!queue.isEmpty()&&queue.peek()+K<=i){
                queue.poll();
            }
            if( ( A[i]+queue.size() ) % 2 ==0){
                if(i + K > n) return -1;
                res++;
                queue.offer(i);
            }
        }
        return res;
    }
}
