package a1122;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/11/14 9:49
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
       return Arrays.stream(arr1).boxed().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a1 = map.getOrDefault(o1, 1001);
                int a2 = map.getOrDefault(o2, 1001);
                if (a1 != 1001 || a2 != 1001) {
                    return a1 - a2;
                }

                return o1 - o2;
            }
        }).mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6});
    }
}
