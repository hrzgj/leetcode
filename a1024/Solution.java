package a1024;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2020/10/24 15:38
 */
public class Solution {
    public int videoStitching(int[][] clips, int T) {
        int[] dp=new int[T+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0]=0;
        for(int i=1;i<=T;i++){
            for(int[] ints:clips){
                if(ints[0]<i&&i<=ints[1]){
                    dp[i]=Math.min(dp[i],dp[ints[0]]+1);
                }
            }
        }
        return dp[T]==Integer.MAX_VALUE-1?-1:dp[T];

    }
}
