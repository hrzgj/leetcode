package a1011;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/4/26 16:30
 */
public class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int left= Arrays.stream(weights).max().getAsInt(),right=Arrays.stream(weights).sum();
        while (left<right){
            int mid=(right-left)/2+left;
            int sum=0;
            int need=0;
            for (int i = 0; i < weights.length; i++) {
                sum+=weights[i];
                if(sum>mid){
                    need++;
                    sum=weights[i];
                }
            }
            if(need>D){
                left=need+1;
            }else{
                right=need;
            }
        }
        return left;
    }
}
