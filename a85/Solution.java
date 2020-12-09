package a85;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/12/8 20:35
 */
public class Solution {

    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int res=0;
        int[] height=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }else {
                    height[j]=0;
                }
            }
            res=Math.max(res,largestRectangleArea(height));
        }
        return res;
    }

    public int largestRectangleArea(int[] heights) {
        int res=0;
        int length=heights.length;
        if(length==0){
            return 0;
        }
        if(length==1){
            return heights[0];
        }
        int[] newHeights=new int[length+2];
        System.arraycopy(heights,0,newHeights,1,length);
        length+=2;
        heights=newHeights;
        Deque<Integer> deque=new LinkedList<>();
        deque.push(0);
        for(int i=1;i<length;i++){
            while (heights[i]<heights[deque.peek()]){
                int high=heights[deque.pop()];
                int weight=i-deque.peek()-1;
                res=Math.max(res,high*weight);
            }
            deque.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.maximalRectangle(new char[][]{
                {'1','0'}
        });
    }
}
