package a435;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: chenyu
 * @date: 2020/12/31 17:21
 */
public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,((o1, o2) -> o1[0]-o2[0]));
        int n=intervals.length;
        int res=0;
        int right=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=right){
                right=intervals[i][1];
            }else {
                res++;
                if(intervals[i][1]<right){
                    right=intervals[i][1];
                }
            }
        }
        return res;
    }
}
