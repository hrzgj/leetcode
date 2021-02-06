package a1423;

/**
 * @author: chenyu
 * @date: 2021/2/6 9:14
 */
public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res=0,sum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        res=Math.max(res,sum);
        for(int i=0;i<k;i++){
            sum+=cardPoints[n-1-i];
            sum-=cardPoints[k-i-1];
            res=Math.max(res,sum);
        }
        return res;
    }
}
