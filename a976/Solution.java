package a976;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/11/29 9:58
 */
public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i=A.length;i>=2;i--){
            int a=A[i];
            int b=A[i-1];
            int c=A[i-2];
            if(a<b+c){
                return a+b+c;
            }
        }
        return 0;
    }
}
