package interview0102;


import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/4/9 9:25
 */
public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return new String(c1).equals(new String(c2));

    }
}