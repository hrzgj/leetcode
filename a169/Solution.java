package a169;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/12/19 9:20
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int size=map.getOrDefault(num,0)+1;
            if(size>n){
                return num;
            }
            map.put(num,size);
        }
        return 0;
    }
}
