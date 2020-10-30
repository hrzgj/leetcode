package a463;

/**
 * @author: chenyu
 * @date: 2020/10/30 9:42
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        int result=0;
        int n=grid.length;
        if(n<=0){
            return 0;
        }
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(i-1<0||grid[i-1][j]==0){
                        result++;
                    }
                    if(i+1>=n||grid[i+1][j]==0){
                        result++;
                    }
                    if(j-1<0||grid[i][j-1]==0){
                        result++;
                    }
                    if(j+1>=m||grid[i][j+1]==0){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
