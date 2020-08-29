package a773;

/**
 * @author: chenyu
 * @date: 2020/8/16 9:47
 */
public class Solution {
    int n,m;
    int oldColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        n=image.length;
        m=image[0].length;
        oldColor=image[sr][sc];
        if(oldColor==newColor){
            return image;
        }
        dfs(image,sr,sc,newColor);
        return image;
    }

    private void dfs(int[][] image,int x,int y,int newColor){
        if(x<0||x>=n||y<0||y>=m||image[x][y]!=oldColor){
            return;
        }
        image[x][y]=newColor;
        dfs(image,x+1,y,newColor);
        dfs(image,x-1,y,newColor);
        dfs(image,x,y-1,newColor);
        dfs(image,x,y+1,newColor);
    }
}
