package a130;

import java.util.Queue;

/**
 * @author: chenyu
 * @date: 2020/8/11 20:15
 */
class Solution {
    int n,m;
    public void solve( char[][] board) {
        m=board.length;
        if(m==0){
            return;
        }
        n=board[0].length;
        for(int i=0;i<m;i++){
            dfs(board,i,0);
            dfs(board,i,n-1);
        }
        for(int i=1;i<n-1;i++){
            dfs(board,0,i);
            dfs(board,m-1,i);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='x'){
                    board[i][j]='O';
                    continue;
                }
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }

    private void dfs(char[][] board,int x,int y){
        if(x<0||x>=m||y<0||y>=n||board[x][y]=='X'||board[x][y]=='x'){
            return;
        }
        board[x][y]='x';
        dfs(board,x+1,y);
        dfs(board,x-1,y);
        dfs(board,x,y+1);
        dfs(board,x,y-1);
    }
}
