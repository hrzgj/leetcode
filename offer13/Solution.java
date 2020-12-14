package offer13;

/**
 * @author: chenyu
 * @date: 2020/12/14 13:56
 */
public class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] visit=new boolean[m][n];
        return dfs(0,0,m,n,k,visit);
    }

    private int dfs(int i,int j,int m,int n,int k, boolean[][] visit){
        if (i < 0 || i >= m || j < 0 || j >= n || (i/10 + i%10 + j/10 + j%10) > k || visit[i][j]) {
            return 0;
        }
        visit[i][j] = true;
        return dfs(i + 1, j, m, n, k, visit) + dfs(i - 1, j, m, n, k, visit) +
                dfs(i, j + 1, m, n, k, visit) + dfs(i, j - 1, m, n, k, visit) + 1;
    }
}
