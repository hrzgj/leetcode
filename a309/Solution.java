package a309;

/**
 * @author: chenyu
 * @date: 2020/7/10 9:32
 */
public class Solution {
    public int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // f[i][0]: 手上持有股票的最大收益
        // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }

    public int maxProfit(int[] prices){
        int n=prices.length;
        //手上不持有股票，并且不在冷冻期中的累计最大收益
        int nono=0;
        //手上持有股票的最大收益
        int have=-prices[0];
        //手上不持有股票，并且处于冷冻期中的累计最大收益
        int noin=0;
        for(int i=1;i<n;i++){
            int newNono=Math.max(nono,noin);
            int newHave=Math.max(have,nono-prices[i]);
            int newNoin=have+prices[i];
            nono=newNono;
            have=newHave;
            noin=newNoin;
        }
        return Math.max(nono,noin);
    }
}
