package a529;

/**
 * @author: chenyu
 * @date: 2020/8/20 9:52
 */
public class Solution {
    int n,m;
    public char[][] updateBoard(char[][] board, int[] click) {
        n=board.length;
        m=board[0].length;
        if(board[click[0]][click[1]]=='M'){
            board[click[0]][click[1]]='X';
            return board;
        }
        dfs(board,click[0],click[1]);
        return board;
    }

    private void dfs(char[][] board,int x,int y){
        if(x<0||x>n||y<0||y>m){
            return;
        }
        if(board[x][y]=='E') {
            int boomNum = checkBoom(board, x, y);
            if (boomNum == 0) {
                board[x][y] = 'B';
                for (int i = x - 1; i <= x + 1; i++) {
                    for (int j = y - 1; j < j + 1; j++) {
                        dfs(board, i, j);
                    }
                }
            } else {
                board[x][y] = (char) (boomNum + '0');
            }
        }
    }



    private int checkBoom(char[][] board,int x,int y){
        int result=0;
        for(int i=x-1;i<=x+1;i++){
            if(i<0||i>=n){
                continue;
            }
            for(int j=y-1;j<=y+1;j++){
                if(j<0||j>=m){
                    continue;
                }
                if(board[i][j]=='M'){
                    result++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        char[][] s={{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
        int [] a={3,0};
        solution.updateBoard(s,a);
    }
}
