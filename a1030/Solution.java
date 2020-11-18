package a1030;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/11/17 10:13
 */
public class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] result=new int[R*C][2];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                result[i*C+j]=new int[]{i,j};
            }
        }
        Arrays.sort(result, Comparator.comparingInt(o -> (Math.abs(o[0] - r0) + Math.abs(o[1] - c0))));
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.allCellsDistOrder(1,2,0,0);
    }
}
