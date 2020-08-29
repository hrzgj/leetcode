package a343;

/**
 * @author: chenyu
 * @date: 2020/7/30 9:58
 */
public class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        for(int i=2;i<=n;i++){
            int temp=0;
            for(int j=1;j<i;j++){
                temp=Math.max(temp,Math.max(j*(i-j),j*dp[i-j]));
            }
            dp[i]=temp;
        }
        return dp[n];
    }
}
