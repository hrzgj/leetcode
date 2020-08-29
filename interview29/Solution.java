package interview29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: chenyu
 * @date: 2020/6/5 15:27
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int highLength=matrix.length;
        int length=matrix[0].length;
        int[] result=new int[highLength*length];
        int k=0;
        int left=0,right=length-1,top=0,buttom=highLength-1;
        while (top<=buttom&&left<=right){
            for(int i=left;i<right;i++){
                result[k++]=matrix[top][i];
            }
            for(int i=top;i<=buttom;i++){
                result[k++]=matrix[i][right];
            }
            //排除只剩一行或一排的情况，如果只剩一排或一行，无需执行这个
            if (left < right && top < buttom) {
                for(int i=right-1;i>=left;i--){
                    result[k++]=matrix[buttom][i];
                }
                for(int i=buttom-1;i>top;i--){
                    result[k++]=matrix[i][left];
                }
            }
            left++;
            right--;
            top++;
            buttom--;
        }
        List<Integer> integers =Arrays.stream( result ).boxed().collect(Collectors.toList());
        return integers;
    }
}
