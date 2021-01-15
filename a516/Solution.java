package a516;

/**
 * @author: chenyu
 * @date: 2021/1/15 10:24
 */
public class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        char[] ch=s.toCharArray();
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(ch[i]==ch[j]){
                    dp[i][j]=dp[i+1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
