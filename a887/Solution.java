package a887;

/**
 * @author: chenyu
 * @date: 2021/1/13 11:17
 */
public class Solution {
    public int superEggDrop(int K, int N) {
        if(K==0){
            return 0;
        }
        if(K==1){
            return N;
        }
        int[][] f=new int[N+1][K+1];
        for(int i=1;i<=K;i++){
            f[1][i]=1;
        }
        for(int i=2;i<=N;i++){
            for(int j=1;j<=K;j++){
                f[i][j]=f[i-1][j-1]+f[i-1][j]+1;
            }
            if(f[i][K]>=N){
                return i;
            }
        }
        return 0;
    }
}
