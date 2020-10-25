package a56;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2020/10/23 16:50
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return new int[0][];
        }
        Arrays.sort(intervals, (o1, o2) -> o1[0]-o2[0]);
        int[][] result=new int[intervals.length][2];
        int index=0;
        result[0][0]=intervals[0][0];
        result[0][1]=intervals[0][1];
        for(int[] ints:intervals){
            if(index==0){
                index++;
                continue;
            }
            if(ints[0]<=result[index-1][0]){
                result[index-1][1]=Math.max(result[index-1][1],ints[1]);
            }else {
                result[index++]=ints;
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }
}
