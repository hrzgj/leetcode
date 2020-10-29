package a42;

/**
 * @author: chenyu
 * @date: 2020/10/28 11:58
 */
public class Solution {
    public int trap(int[] height) {
        if (height.length==0) return 0;
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;

        int l_max = height[0];
        int r_max = height[n - 1];

        while (left <= right) {
            l_max = Math.max(l_max, height[left]);
            r_max = Math.max(r_max, height[right]);

            // res += min(l_max, r_max) - height[i]
            if (l_max < r_max) {
                res += l_max - height[left];
                left++;
            } else {
                res += r_max - height[right];
                right--;
            }
        }
        return res;
    }
}
