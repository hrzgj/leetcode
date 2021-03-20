package a172;

/**
 * @author: chenyu
 * @date: 2021/3/20 10:22
 */
public class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while (n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
