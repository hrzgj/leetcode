package interview64;

/**
 * @author: chenyu
 * @date: 2020/6/2 12:59
 */
public class Solution {
    public int sumNums(int n) {

        boolean boolea=n<=0||(n+=sumNums(n-1))>0;
        return n;
    }
}

