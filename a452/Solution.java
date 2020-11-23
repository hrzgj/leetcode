package a452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2020/11/23 9:13
 */
public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int result=0;
        int pos=points[0][1];
        for(int[] point:points){
            if(point[0]>pos){
                result++;
                pos=point[1];
            }
        }
        return result;
    }
}
