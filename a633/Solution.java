package a633;

/**
 * @author: chenyu
 * @date: 2021/3/12 17:00
 */
public class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a=0;a*a<=c;a++){
            double b=Math.sqrt(c-a*a);
            if(b==(int)b){
                return true;
            }
        }
        return false;
    }
}
