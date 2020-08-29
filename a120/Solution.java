package a120;

import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/7/14 11:05
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        int[][] dp=new int[n][m];
        dp[0][0]=triangle.get(0).get(0);
        int result=Integer.MAX_VALUE;
        if(n==1){
            return dp[0][0];
        }
        for(int i=1;i<n;i++){
            List<Integer> list=triangle.get(i);
            for(int j=0;j<list.size();j++){
                if(j==0){
                    dp[i][j]=list.get(j)+dp[i-1][j];
                }else if(j==list.size()-1){
                    dp[i][j]=list.get(j)+dp[i-1][j-1];
                }
                else {
                    int min=Math.min(dp[i-1][j],dp[i-1][j-1]);
                    dp[i][j]=list.get(j)+min;
                }
                if(i==n-1){
                    result=Math.min(result,dp[i][j]);
                }
            }
        }
        return result;
    }
}
