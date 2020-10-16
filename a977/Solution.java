package a977;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/16 8:52
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result=new int[A.length];
        int left=0,right=A.length-1,index=A.length-1;
        while (index>=0){
            if(Math.abs(A[left])<=Math.abs(A[right])){
                result[index]=A[right]*A[right];
                right--;
            }else {
                result[index]=A[left]*A[left];
                left++;
            }
            index--;
        }
        return result;
    }
}
