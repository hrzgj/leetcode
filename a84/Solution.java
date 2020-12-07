package a84;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/12/7 10:10
 */
public class Solution {
    public int largestRectangleArea(int[] heights) {
        int res=0;
        int length=heights.length;
        if(length==0){
            return 0;
        }
        if(length==1){
            return heights[0];
        }
        int[] newHeights=new int[length+2];
        System.arraycopy(heights,0,newHeights,1,length);
        length+=2;
        heights=newHeights;
        Deque<Integer> deque=new LinkedList<>();
        deque.push(0);
        for(int i=1;i<length;i++){
            while (heights[i]<heights[deque.peek()]){
                int high=heights[deque.peek()];
                int weight=i-deque.pop()-1;
                res=Math.max(res,high*weight);
            }
            deque.push(i);
        }
        return res;
    }
}
