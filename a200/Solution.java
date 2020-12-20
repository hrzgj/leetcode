package a200;

/**
 * @author: chenyu
 * @date: 2020/12/20 9:54
 */
public class Solution {
    int n,m;
    public int numIslands(char[][] grid) {
        int res=0;
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfs(int i,int j,char[][] grid){
        if(i<0||i>=n||j<0||j>=m){
            return;
        }
        grid[i][j]='2';
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);
    }
}
