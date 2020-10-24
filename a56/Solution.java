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
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
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
    public int minDeletionSize(String[] A) {
        int length=A.length;
        if(length==0){
            return 0;
        }
        int charLength=A[0].length();
        int result=0;
        for(int i=0;i<charLength;i++){
            char c=A[0].charAt(i);
            int j;
            for(j=1;j<length;j++){
                if(c>A[j].charAt(i)){
                    break;
                }else if(c==A[j].charAt(i) &&
                        A[j-1].substring(i,charLength).compareTo(A[j].substring(i,charLength))>0){
                    break;
                }
                else{
                    c=A[j].charAt(i);
                }
            }
            if(j==length){
                return result;
            }else{
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.minDeletionSize(new String[]{"xga","xfb","yfa"});
    }
}
