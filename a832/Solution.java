package a832;

/**
 * @author: chenyu
 * @date: 2021/2/24 9:40
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int m=A.length,n=A[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<(n+1)/2;j++){
                int temp=A[i][j] ^ A[i][n-j-1];
                if(temp==0){
                    if(A[i][j]==0){
                        A[i][j]=1;
                        A[i][n-j-1]=1;
                    } else {
                        A[i][j]=0;
                        A[i][n-j-1]=0;
                    }
                }
            }
        }
        return A;
    }
}
