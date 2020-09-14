package a787;

import javax.annotation.Resource;

/**
 * @author: chenyu
 * @date: 2020/9/14 20:25
 */
public class Solution {
    int sum=Integer.MAX_VALUE;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int x=flights.length;
        for(int i=0;i<x;i++){
            if(flights[i][1]==dst){
                find(K,flights[i][0],i,src,flights[i][2],x,flights);
            }
        }
        if(sum==Integer.MAX_VALUE){
            return -1;
        }
        return sum;
    }

    private void find(int k,int src,int i,int oldSrc,int sums,int x, int[][] flights){
        if(k<0){
            return;
        }
        if(src == oldSrc){
            sum=Math.min(sums,sum);
        }
        for(int j=0;j<x;j++){
            if(flights[j][1]==src){
                find(k-1,flights[j][0],j,oldSrc,sums+flights[j][2],x,flights);
            }
        }
    }


}
