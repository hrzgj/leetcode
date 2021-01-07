package a547;

/**
 * @author: chenyu
 * @date: 2021/1/7 10:59
 */
public class Solution {
    boolean[] visit;
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        visit=new boolean[n];
        int res=0;
        for(int i=0;i<n;i++){
            if(!visit[i]) {
                res++;
                dfs(isConnected, i);
            }
        }
        return res;
    }

    private void dfs(int[][] isConnected,int i){
        if(visit[i]){
            return;
        }
        visit[i]=true;
        int[] connected=isConnected[i];
        for(int j=0;j<connected.length;j++){
            if(connected[i]==1){
                dfs(isConnected,j);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
