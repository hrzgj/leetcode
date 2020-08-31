package a746;

/**
 * @author: chenyu
 * @date: 2020/8/31 14:35
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int one=cost[0],two=cost[1],three=0;
        for(int i=2;i<cost.length;i++){
            three=Math.min(one,two)+cost[i];
            one=two;
            two=three;
        }
        return Math.min(one,two);
    }
}
