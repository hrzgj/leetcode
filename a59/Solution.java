package a59;

/**
 * @author: chenyu
 * @date: 2020/11/30 12:18
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int i=1;
        int left=0,right=n-1,top=0,bottom=n-1;
        while(i<=n*n){
            for(int j=left;j<=right;j++){
                res[top][j]=i++;
            }
            for(int j=top+1;j<=bottom;j++){
                res[j][right]=i++;
            }
            for(int j=right-1;j>=left;j--){
                res[bottom][j]=i++;
            }
            for(int j=bottom-1;j>top;j--){
                res[j][left]=i++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
