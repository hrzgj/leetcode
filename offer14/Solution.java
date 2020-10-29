package offer14;

/**
 * @author: chenyu
 * @date: 2020/10/29 17:23
 */
public class Solution {
    public int cuttingRope(int n) {
        if(n==2){
            return 1;
        }
        int a=n/3,b=n%3;
        if(b==0){
            return (int)Math.pow(3,a);
        }
        if(b==1){
            return (int)Math.pow(3,a-1)*4;
        }
        if (b == 2) {
            return (int)Math.pow(3,a)*2;
        }
        return 0;
    }
}
