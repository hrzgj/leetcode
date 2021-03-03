package a338;

/**
 * @author: chenyu
 * @date: 2021/3/3 9:33
 */
public class Solution {
    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        dp[0]=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
            }else {
                dp[i]=dp[i-1]+1;
            }
        }
        return dp;
    }
}

