package a738;

import java.util.ArrayList;

/**
 * @author: chenyu
 * @date: 2020/12/15 9:36
 */
public class Solution {
    public int monotoneIncreasingDigits(int N) {
        int n=111111111;
        int res=0;
        for(int i=0;i<9;i++){
            while(res+n>N){
                n/=10;
            }
            res+=n;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.monotoneIncreasingDigits(10);
    }
}
