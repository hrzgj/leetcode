package a973;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2020/11/9 17:20
 */
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (o1, o2) -> o1[1]*o1[1]+o1[0]*o1[0]-o2[0]*o2[0]-o2[1]*o2[1]);
        return Arrays.copyOfRange(points,0,K);
    }
}
