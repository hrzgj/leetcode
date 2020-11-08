package a122;

/**
 * @author: chenyu
 * @date: 2020/11/8 9:49
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int result=0;
        for(int i=1;i<prices.length;i++){
            result+=Math.max(0,prices[i]-prices[i-1]);
        }
        return result;
    }
}
