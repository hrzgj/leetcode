package a474;

import java.security.interfaces.RSAKey;

/**
 * @author: chenyu
 * @date: 2020/9/2 9:01
 */
public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(String s:strs){
            int[] nums=findZeroAndOne(s);
            for(int i=m;i>=nums[0];i--){
                for(int j=n;j>=nums[1];j--){
                    dp[i][j]=Math.max(dp[i][j],1+dp[i-nums[0]][j-nums[1]]);
                }
            }
        }
        return dp[m][n];
    }

    private int[] findZeroAndOne(String s){
        int[] result=new int[2];
        for(int i=0;i<s.length();i++){
            result[s.charAt(i)-'0']++;
        }
        return result;
    }
}
