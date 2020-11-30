package a59;

/**
 * @author: chenyu
 * @date: 2020/11/30 12:18
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int i=1;
        int[][] result=new int[n][n];
        int left=0,right=n-1,button=0,under=n-1;
        while(i<=n*n){
            int j=left;
            while(j<=right-1){
                result[button][j++]=i++;
            }
            j=button;
            while(j<=under){
                result[j++][right]=i++;
            }
            if(left<right){
                j=right-1;
                while(j>left){
                    result[under][j--]=i++;
                }
                j=under;
                while(j>button){
                    result[j--][left]=i++;
                }
            }
            left++;
            right--;
            button++;
            under--;
        }
        return result;
    }
}
