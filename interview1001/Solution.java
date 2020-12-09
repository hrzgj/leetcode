package interview1001;

/**
 * @author: chenyu
 * @date: 2020/12/9 10:51
 */
public class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int a=m-1,b=n-1;
        int index=m+n-1;
        while(a>=0&&b>=0){
            A[index--]=A[a]>B[b]?A[a--]:B[b--];
        }
        while(b>=0){
            A[index--]=B[b--];
        }

    }
}
