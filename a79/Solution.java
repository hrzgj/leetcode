package a79;

/**
 * @author: chenyu
 * @date: 2020/9/13 10:24
 */
public class Solution {
    char s;
    public boolean exist(char[][] board, String word) {
        s= word.charAt(0);
        boolean[][] use=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==s){
                    boolean b=dfs(board,word,1,i,j,use);
                    if(b){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word,int i,int x,int y,boolean[][] use){
        if(x>=board.length||x<0||y>=board[0].length||y<0){
            return false;
        }
        if(use[x][y]){
            return false;
        }
        if(board[x][y]==s){
            if(i==word.length()){
                return true;
            }
            use[x][y]=true;
            s=word.charAt(i);
            if(dfs(board,word,i+1,x+1,y,use)||dfs(board,word,i+1,x-1,y,use)||dfs(board,word,i+1,x,y+1,use)||dfs(board,word,i+1,x,y-1,use)){
                return true;
            }else {
                use[x][y]=false;
                s=word.charAt(i-1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        char[][] s={
                {'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}
        };
        boolean c=solution.exist(s,"ABCB");
    }
}
