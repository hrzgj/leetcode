package offer17;

/**
 * @author: chenyu
 * @date: 2020/12/24 10:26
 */
public class Solution {
    public int[] printNumbers(int n) {
        double m=Math.pow(10.0, n);
        int[] res=new int[(int)m];
        for(int i=0;i<m;i++){
            res[i]=i+1;
        }
        return res;
    }
}
