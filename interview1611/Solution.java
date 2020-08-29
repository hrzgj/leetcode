package interview1611;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/7/8 19:55
 */
public class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        int [] a=new int[k+1];
        if(k==0){
            return new int[0];
        }
        if(shorter==longer){
            return new int[]{shorter*k};
        }
        int result=shorter*k;
        a[0]=result;
        for(int i=1;i<=k;i++){
            result-=shorter;
            result+=longer;
            a[i]=result;
        }
        return a;
    }
}
