package a5548;

/**
 * @author: chenyu
 * @date: 2020/10/25 10:54
 */
public class Solution {

        public int minimumEffortPath(int[][] heights) {
            int dp[][] = new int[heights.length][heights[0].length];
            for(int i = 0;i<heights.length;i++) {
                for(int j = 0;j<heights[0].length;j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            dp[0][0] = 0;
            while(true) {
                boolean flag = false;
                for(int i = 0;i<heights.length;i++) {
                    for(int j = 0;j<heights[i].length;j++) {
                        int pre = dp[i][j];
                        if(i-1>=0)dp[i][j] = Math.min(dp[i][j],Math.max(Math.abs(heights[i][j]-heights[i-1][j]),dp[i-1][j]));
                        if(i+1<heights.length) dp[i][j] = Math.min(dp[i][j],Math.max(Math.abs(heights[i][j]-heights[i+1][j]),dp[i+1][j]));
                        if(j-1>=0)dp[i][j] = Math.min(dp[i][j],Math.max(Math.abs(heights[i][j]-heights[i][j-1]),dp[i][j-1]));
                        if(j+1<heights[0].length)dp[i][j] = Math.min(dp[i][j],Math.max(Math.abs(heights[i][j]-heights[i][j+1]),dp[i][j+1]));
                        if(pre != dp[i][j])flag = true;
                    }
                }
                if(!flag) return dp[heights.length-1][heights[0].length-1];
            }
        }

}
