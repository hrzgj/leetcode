package a1300;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author: chenyu
 * @date: 2020/6/14 8:40
 */
public class Solution {
    public int findBestValue(int[] arr, int target) {
        int length=arr.length;
        int best=target/length;
        int sum=Arrays.stream(arr).sum();
        if(sum<=target){
            return Arrays.stream(arr).max().getAsInt();
        }
        sum=best*length;
        int last=sum;
        while (sum<target){
            best++;
            last=sum;
            sum=0;
            for(int a:arr){
                if(a>best){
                    sum+=best;
                }else {
                    sum+=a;
                }
            }
        }
        if((sum-target)>=(target-last)){
            return best-1;
        }else {
            return best;
        }
    }
}
