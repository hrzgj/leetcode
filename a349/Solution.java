package a349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/11/2 10:55
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        int[] result=new int[set.size()];
        int index=0;
        for(int num:nums2){
            if(set.contains(num)&&!hashSet.contains(num)){
                result[index++]=num;
                hashSet.add(num);
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }
}
