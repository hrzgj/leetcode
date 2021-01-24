package a264;

/**
 * @author: chenyu
 * @date: 2021/1/24 10:03
 */
public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int a=0,b=0,c=0;
        for(int i=1;i<n;i++){
            int two=dp[a]*2,three=dp[b]*3,five=dp[c]*5;
            dp[i]=Math.min(three,Math.min(two,five));
            if(dp[i]==three) b++;
            if(dp[i]==two) a++;
            if(dp[i]==five) c++;
        }
        return dp[n-1];
    }
}
