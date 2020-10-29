package offer63;

/**
 * @author: chenyu
 * @date: 2020/10/29 21:18
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int result=0;
        int ans=prices[0];
        for(int price:prices){
            if(price<ans){
                ans=price;
            }else {
                result=Math.max(result,price-ans);
            }
        }
        return result;
    }
}
