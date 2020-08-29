package a70;

/**
 * @author: chenyu
 * @date: 2020/6/13 9:02
 */
public class Solution {
    public int climbStairs(int n) {
        int first=0,second=1,result = 0;
        while (n>0){
            result=first+second;
            first=second;
            second=result;
            n--;
        }
        return result;
    }
}
