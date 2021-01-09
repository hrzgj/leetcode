package a123;

/**
 * @author: chenyu
 * @date: 2021/1/9 10:21
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int buyOne=-prices[0],sellOne=0;
        int buyTwo=-prices[0],sellTwo=0;
        for(int i=1;i<prices.length;i++){
            sellOne=Math.max(prices[i]+buyOne,sellOne);
            buyOne=Math.max(buyOne,-prices[i]);
            sellTwo=Math.max(prices[i]+buyTwo,sellTwo);
            buyTwo=Math.max(buyTwo,sellOne-prices[i]);
        }
        return sellTwo;
    }
}
