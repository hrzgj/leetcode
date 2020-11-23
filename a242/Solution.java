package a242;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/11/22 9:55
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc, tc);
    }
}
