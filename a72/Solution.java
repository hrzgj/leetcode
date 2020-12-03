package a72;

/**
 * @author: chenyu
 * @date: 2020/12/3 11:59
 */
public class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int[][] dp=new int[n+1][m+1];
        dp[0][0]=0;
        for(int i=1;i<=n;i++){
            dp[i][0]=i;
        }
        for(int i=1;i<=m;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int delete=dp[i-1][j]+1;
                int add=dp[i][j-1]+1;
                if(word1.charAt(i)==word2.charAt(j)){
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(delete,add));
                }else {
                    int min=Math.min(dp[i-1][j-1]+1,Math.min(delete,add));
                }
            }
        }
        return dp[n][m];
    }
}
