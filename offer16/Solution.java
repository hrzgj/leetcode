package offer16;

/**
 * @author: chenyu
 * @date: 2020/12/24 10:24
 */
public class Solution {
    public double myPow(double x, int n) {
        if(n>=0){
            return pow(x,n);
        }
        else {
            return 1.0/pow(x,-n);
        }
    }

    private double pow(double x,int n){
        if(n==0){
            return 1.0;
        }
        double y=pow(x,n/2);
        if(n%2==0){
            return y*y;
        }else {
            return y*y*x;
        }
    }
}