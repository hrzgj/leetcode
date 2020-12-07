package a861;

/**
 * @author: chenyu
 * @date: 2020/12/7 9:43
 */
public class Solution {
    //先将第一列的全部置成1，后面的列取0和1个数的最大值去加。
    public int matrixScore(int[][] A) {
        int n=A.length,m=A[0].length;
        int res=n*(1<<(m-1));
        for(int i=0;i<n;i++){
            if(A[i][0]==0){
                for(int j=0;j<m;j++){
                    A[i][j]^=1;
                }
            }
        }
        for(int i=1;i<m;i++){
            int num=0;
            for(int j=0;j<n;j++){
                if(A[j][i]==0){
                    num++;
                }
            }
            num=Math.max(num,n-num);
            res+=num*(1<<(m-1-i));
        }
        return res;
    }
}
