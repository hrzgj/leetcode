package a5536;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/10/11 10:42
 */
public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int result=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               int sum=0;
               for(int[] road:roads){
                   if(road[0]==i||road[1]==i||road[1]==j||road[0]==j){
                       sum++;
                   }
               }
               result=Math.max(result,sum);
           }
       }
       return result;

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int i=solution.maximalNetworkRank(8,new int[][]{{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}});
    }
}
