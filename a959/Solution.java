package a959;

/**
 * @author: chenyu
 * @date: 2021/1/25 9:05
 */
public class Solution {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        boolean [][] graph = new boolean[n * 3][n * 3];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(grid[i].charAt(j) == '/') {
                    graph[i * 3][j * 3 + 2] = true;
                    graph[i * 3 + 1][j * 3 + 1] = true;
                    graph[i * 3 + 2][j * 3] = true;
                } else if(grid[i].charAt(j) == '\\') {
                    graph[i * 3][j * 3] = true;
                    graph[i * 3 + 1][j * 3 + 1] = true;
                    graph[i * 3 + 2][j * 3 + 2] = true;
                }
            }
        }
        int res = 0;
        for(int i = 0; i < n * 3; ++i) {
            for(int j = 0; j < n * 3; ++j) {
                if(!graph[i][j]) {
                    dfs(graph, i, j);
                    res++;
                }
            }
        }
        return res;

    }

    private void dfs(boolean [][] graph, int i, int j) {
        int n = graph.length;
        if(i >= 0 && j >= 0 && i < n && j < n && !graph[i][j]) {
            graph[i][j] = true;
            dfs(graph, i, j - 1);
            dfs(graph, i, j + 1);
            dfs(graph, i - 1, j);
            dfs(graph, i + 1, j);
        }
    }
}
