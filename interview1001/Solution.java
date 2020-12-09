package interview1001;

/**
 * @author: chenyu
 * @date: 2020/12/9 10:51
 */
public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        for(int i=m;i<n;i++){
            A[i]=B[i-m];
        }
        
    }
}
