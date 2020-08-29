package a1014;

/**
 * @author: chenyu
 * @date: 2020/6/17 8:26
 */
public class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int ans = 0, mx = A[0] + 0;
        for (int j = 1; j < A.length; ++j) {
            ans = Math.max(ans, mx + A[j] - j);
            // 边遍历边维护
            mx = Math.max(mx, A[j] + j);
        }
        return ans;
    }



    //超时
    public int maxScoreSightseeingPair2(int[] A) {
        int result=A[1]+A[0]-1;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(result<A[i]+A[j]+i-j){
                    result=A[i]+A[j]+i-j;
                }
            }
        }
        return result;
    }
}
