package a1018;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2021/1/14 9:42
 */
public class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list=new ArrayList<>(A.length*2);
        long res=0;
        for (int value : A) {
            res >>= 1;
            res += value;
            list.add(res % 5 == 0);
        }
        return list;
    }
}
