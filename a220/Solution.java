package a220;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author: chenyu
 * @date: 2021/4/17 9:18
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.containsNearbyAlmostDuplicate(new int[]{1,2,3,1},3,0);
    }
}
