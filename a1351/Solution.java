package a1351;

/**
 * @author: chenyu
 * @date: 2021/1/11 10:29
 */
public class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        if(n<=0){
            return 0;
        }
        int m=grid[0].length;
        int left=n-1,right=0;
        int res=0;
        while (left>=0&&right<n){
            if(grid[left][right]>=0){
                right++;
            }else {
                res+=m-right;
                left--;
            }
        }
        return res;
    }
}
