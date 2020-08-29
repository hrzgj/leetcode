package a350;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/7/13 8:48
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new LinkedList<>();
        List<Integer> result=new LinkedList<>();
            for(int a:nums2){
                list.add(a);
            }
            for(int a:nums1){
                if(list.contains(a)){
                    Integer b= a;
                    list.remove(b);
                    result.add(b);
                }
            }
            return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
