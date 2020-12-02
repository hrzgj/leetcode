package a69;

/**
 * @author: chenyu
 * @date: 2020/12/2 15:28
 */
public class Solution {
    public int mySqrt(int x) {
        long low=0,high=x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long r = mid * mid;
            if (r > x) high = mid - 1;
            else if (r < x) low = mid + 1;
            else return (int) mid;
        }
        return (int) low - 1;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.mySqrt(10);
    }
}
