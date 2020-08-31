package a121;

/**
 * @author: chenyu
 * @date: 2020/8/31 13:24
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int result=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                result=Math.max(prices[j]-prices[i],result);
            }
        }
        return result;
    }
}
