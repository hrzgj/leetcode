package a191;

/**
 * @author: chenyu
 * @date: 2021/3/22 10:00
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            res+=n&1;
            n=n>>>1;
        }
        return res;
    }
}
