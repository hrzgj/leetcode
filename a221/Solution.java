package a221;

/**
 * @author: chenyu
 * @date: 2020/12/20 11:09
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int[][] dp=new int[n][m];
        int res=0;
        for(int i=0;i<n;i++){
            if(matrix[i][0]=='1') {
                res=1;
                dp[i][0] = 1;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[0][i]=='1') {
                res=1;
                dp[0][i] = 1;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]=='1'){
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
                res=Math.max(dp[i][j],res);
            }
        }
        return res*res;
    }
}
