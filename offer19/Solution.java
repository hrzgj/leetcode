package offer19;

/**
 * @author: chenyu
 * @date: 2020/10/29 18:52
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if(s.length()<=0||p.length()<=0){
            return true;
        }
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for (int i = 0; i < p.length(); i++) { // here's the p's length, not s's
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true; // here's y axis should be i+1
            }
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=p.length();j++){
                if(s.charAt(i-1)==p.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                if(p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }
                if(p.charAt(j-1)=='*'){
                    if(j>=2) {
                        dp[i][j] |= dp[i][j - 2];
                    }
                    if((j >= 2) && ((s.charAt(i - 1) == p.charAt(j - 2)) || (p.charAt(j - 2) == '.'))){
                        dp[i][j]|=dp[i-1][j];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
