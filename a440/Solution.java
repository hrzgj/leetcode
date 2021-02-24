package a440;

/**
 * @author: chenyu
 * @date: 2021/1/2 15:22
 */
public class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while (k > 0){
            long steps = 0, first = curr, last = curr + 1;
            while( first <= n){
                steps = steps + Math.min((long)n+1,last) - first;
                first *= 10;
                last *= 10;
            }
            if(steps <= k){
                curr += 1;
                k -= steps;
            }else {
                curr *= 10;
                k-= 1;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.findKthNumber(100,32);
    }
}
