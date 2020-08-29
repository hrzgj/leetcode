package a461;

/**
 * @author: chenyu
 * @date: 2020/5/27 16:52
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            if ((xor & 1) == 1) {
                distance += 1;
            }
            xor = xor >> 1;
        }
        return distance;
    }
}
