package a304;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/3/2 9:43
 */
public class NumMatrix {
    int[][] sums;
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        if(n==0){
            return;
        }
        ;
        int m=matrix[0].length;
        sums=new int[n][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sums[i][j+1]+=sums[i][j]+matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int res=0;
        for(int i=row1;i<=row2;i++){
            res+=sums[i][col2+1]-sums[i][col1];
        }
        return res;
    }
}
