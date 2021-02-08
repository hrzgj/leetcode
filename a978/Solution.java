package a978;

/**
 * @author: chenyu
 * @date: 2020/9/11 11:00
 */
public class Solution {
    public int maxTurbulenceSize(int[] A) {
        int n=A.length;
        int up=1,down=1;
        int res=1;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                up=down+1;
                down=1;
            }else if(A[i]<A[i-1]){
                down=up+1;
                up=1;
            }else {
                up=down=1;
            }
            res=Math.max(res,Math.max(up,down));
        }
        return res;
    }



}
