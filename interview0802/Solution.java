package interview0802;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/30 16:23
 */
public class Solution {
    List<List<Integer>> lists=new LinkedList<>();
    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1){
            return lists;
        }
        boolean[][] visit=new boolean[obstacleGrid.length][obstacleGrid[0].length];
        dfs(obstacleGrid,0,0,visit);
        return lists;
    }

    private boolean dfs(int[][] obstacleGrid,int i,int j,boolean[][] visit){
        if(lists.size()==obstacleGrid.length+obstacleGrid[0].length-1){
            return true;
        }
        if(i>=obstacleGrid.length||j>=obstacleGrid[0].length||visit[i][j]||obstacleGrid[i][j]==1){
            return false;
        }
        LinkedList<Integer> linkedList=new LinkedList<Integer>(){{add(i);add(j);}};
        lists.add(linkedList);
        visit[i][j]=true;
        if(dfs(obstacleGrid,i+1,j,visit)|| dfs(obstacleGrid,i,j+1,visit) ){
            return true;
        }
        lists.remove(lists.size()-1);
        return false;
    }
}
