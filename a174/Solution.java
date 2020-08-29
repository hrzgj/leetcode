package a174;

/**
 * @author: chenyu
 * @date: 2020/7/12 10:13
 */
public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n=dungeon.length;
        int m=dungeon[0].length;
        int[][] dp=new int[n+1][m+1];
        dp[n][m - 1] = dp[n - 1][m] = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int min=Math.min(dp[i+1][j],dp[i][j+1]);
                dp[i][j]=Math.max(min-dungeon[i][j],1);
            }
        }
        return dp[0][0];
    }
}
