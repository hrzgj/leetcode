package a5534;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/4 10:59
 */
public class Solution {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        double[] angles = new double[points.size()];
        int index = 0, count = 0;   // 自己所在的位置有多少个点
        for(List<Integer> point : points) {
            if(point.get(0).equals(location.get(0)) && point.get(1).equals(location.get(1))) {
                count++;
                continue;
            }
            // 得到[0,360)范围的角度
            double theta = Math.atan2(point.get(1) - location.get(1), point.get(0) - location.get(0)) / Math.PI * 180;
            if(theta < 0) theta += 360;
            angles[index++] = theta;
        }
        Arrays.sort(angles, 0, index);
        double[] nums = new double[index * 2];
        System.arraycopy(angles, 0, nums, 0, index);
        for(int i = 0; i < index; i++) {
            angles[i] += 360;
        }
        System.arraycopy(angles, 0, nums, index, index);

        // 双指针法找angle覆盖下的最长的子数组
        int left = 0, res = 0;
        for(int i = 0; i < nums.length; i++) {
            double diff = nums[i] - nums[left];
            while(left <= i && diff > angle) {
                left++;
                diff = nums[i] - nums[left];
            }
            res = Math.max(res, i - left + 1);
        }
        return res + count;
    }


    public static void main(String[] args) {

        double atan = Math.toDegrees(Math.atan(1));
    }
}
