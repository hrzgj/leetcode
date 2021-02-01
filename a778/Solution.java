package a778;

/**
 * @author: chenyu
 * @date: 2021/1/30 8:48
 */
public class Solution {
    int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int left=0,right=n*n-1;
        while (left<right){
            int mid=(left+right)/2;
            if(grid[0][0] <= mid &&dfs(grid,new boolean[n][n],mid,0,0)){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left;
    }

    private boolean dfs(int[][] grid,boolean[][] visit,int max,int x,int y){
        if(x==grid.length-1 && y==grid.length-1){
            return true;
        }
        visit[x][y]=true;
        for(int[] dir:dirs){
            int newX=dir[0]+x;
            int newY=dir[1]+y;
            if(newX>=0 && newX<grid.length && newY>=0 && newY<grid.length && !visit[newX][newY] && max>=grid[newX][newY]){
                if(dfs(grid,visit,max,newX,newY)){
                    return true;
                }
            }
        }
        return false;
    }
}
