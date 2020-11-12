package a922;

/**
 * @author: chenyu
 * @date: 2020/11/12 9:23
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i=0,j=1;
        while (i<A.length||j<A.length){
            while (i<A.length&&A[i]%2==0){
                i+=2;
            }
            while (j<A.length&&A[j]%2!=0){
                j+=2;
            }
            if(i>=A.length||j>=A.length){
                break;
            }
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i+=2;
            j+=2;
        }

        return A;
    }
}
