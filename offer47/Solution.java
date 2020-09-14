package offer47;

/**
 * @author: chenyu
 * @date: 2020/9/14 20:52
 */
public class Solution {
    public int maxValue(int[][] grid) {
        int x=grid.length,y=grid[0].length;
        int[][] dp=new int[x][y];
        dp[0][0]=grid[0][0];
        for(int i=1;i<x;i++){
            dp[i][0]+=dp[i-1][0];
        }
        for(int i=1;i<y;i++){
            dp[0][i]+=dp[0][i-1];
        }
        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[x-1][y-1];
    }
}
