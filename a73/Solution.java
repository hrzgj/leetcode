package a73;

import java.util.HashSet;

/**
 * @author: chenyu
 * @date: 2020/12/3 15:18
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        HashSet<Integer> column=new HashSet<>();
        HashSet<Integer> row=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    column.add(i);
                    row.add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(column.contains(i)){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0;j<m;j++){
            if(row.contains(j)){
                for(int i=0;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
