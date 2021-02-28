package a896;

/**
 * @author: chenyu
 * @date: 2021/2/28 10:23
 */
public class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length<=1){
            return true;
        }
        boolean type=true,dec=true;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                type=false;
            }
            if(A[i]<A[i-1]){
                dec=false;
            }
        }
        return type||dec;
    }
}
