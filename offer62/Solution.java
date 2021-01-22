package offer62;

/**
 * @author: chenyu
 * @date: 2021/1/22 10:39
 */
public class Solution {
    public int lastRemaining(int n, int m) {
        int res=0;
        for(int i=2;i<=n;i++){
            res=(res+m)%i;
        }
        return res;
    }
}
