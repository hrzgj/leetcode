package a41;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author: chenyu
 * @date: 2020/6/27 10:20
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int result=1;
        boolean flag=true;
        while (flag) {
            flag=false;
            for (int num : nums) {
                if (num == result) {
                    result++;
                    flag=true;
                    break;
                }
            }
        }
        return result;
    }
}
