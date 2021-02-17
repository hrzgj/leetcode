package a566;

/**
 * @author: chenyu
 * @date: 2021/2/17 12:15
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n=nums.length,m=nums[0].length;
        if(n*m<r*c){
            return nums;
        }
        int[][] res=new int[r][c];
        int row=0,column=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[row][column++]=nums[i][j];
                if(column==c){
                    row++;
                    column=0;
                }
            }
        }
        return res;
    }
}
