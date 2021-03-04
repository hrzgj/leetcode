package a354;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2021/3/4 11:02
 */
public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (o1, o2) -> {
            if(o1[0]!=o2[0]){
                return o1[0]-o2[0];
            }
            return o1[1]-o2[1];
        });
        int[] dp=new int[envelopes.length];
        int res=0;
        for(int[] envelope:envelopes){
            int num=envelope[1];
            int i=0,j=res;
            while (i<j){
                int mid=(i+j)/2;
                if(dp[mid]>num){
                    j=mid;
                }else if(dp[mid]<num){
                    i=mid+1;
                }else {
                    j=mid;
                }
            }
            dp[i]=num;
            if(res==j){
                res++;
            }
        }
        return res;
    }

}
