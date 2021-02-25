package a867;

/**
 * @author: chenyu
 * @date: 2021/2/25 10:13
 */
public class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        if(m==n) {
            for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        }
        int[][] res=new int[n][m];
        int column=0,row=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[row][column++]=matrix[j][i];
            }
            column=0;
            row++;
        }
        return res;

    }
}
