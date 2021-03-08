package a132;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/3/8 15:43
 */
public class Solution {
    public int minCut(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],true);
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
            }
        }
        int[] d=new int[n];
        Arrays.fill(d,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            if(dp[0][i]){
                d[i]=0;
            }else {
                for(int j=0;j<i;j++){
                    if(dp[j+1][i]) {
                        d[i] = Math.min(d[i], d[j] + 1);
                    }
                }
            }
        }
        return d[n-1];
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.minCut("aab");
    }
}
