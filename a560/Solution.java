package a560;

import java.util.HashMap;

/**
 * @author: chenyu
 * @date: 2021/4/2 15:36
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(k-sum)){
                count+=map.get(k-sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
