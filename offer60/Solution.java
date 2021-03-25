package offer60;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/3/25 16:22
 */
public class Solution {
    public double[] dicesProbability(int n) {
        double[] dp=new double[6];
        Arrays.fill(dp,1.0/6.0);
        for(int i=2;i<=n;i++){
            double[] temp=new double[5*i+1];
            for(int j=0;j<dp.length;j++){
                for(int k=0;k<6;k++){
                    temp[j+k]+=dp[j]/6;
                }
            }
            dp=temp;
        }
        return dp;
    }

    public double[] twoSum(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];
        for(int i = 1; i <= 6; i++)
            dp[1][i] = 1;

        for(int i = 2; i <= n; i++)
            for(int j = i; j <= 6 * i; j++)
                for(int k = 1; k <= 6 && k <= j; k++)
                    dp[i][j] += dp[i-1][j - k];

        double[] ans = new double[6 * n - n + 1];
        double all=Math.pow(6,n);
        for(int i = n; i <= 6 * n; i++)
            ans[i - n] = ((double)dp[n][i]) / all;
        return ans;
    }
}
