package a54;

import sun.nio.ch.ThreadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: chenyu
 * @date: 2021/3/15 9:06
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        List<Integer> list=new LinkedList<>();
        int left=0,right=m-1,top=0,button=n-1;
        while(left<=right && top<=button){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            for(int i=top+1;i<=button;i++){
                list.add(matrix[i][right]);
            }
            if(left<right && top<button){
                for(int i=right-1;i>=left;i--){
                    list.add(matrix[button][i]);
                }
                for(int i=button-1;i>top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            button--;
        }
        return list;
    }
}
