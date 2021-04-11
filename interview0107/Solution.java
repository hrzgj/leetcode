package interview0107;

/**
 * @author: chenyu
 * @date: 2021/4/11 9:09
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j <n  ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m/2 ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
    }
}
