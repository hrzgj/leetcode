package a697;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/2/20 19:51
 */
public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(num)){
                map.get(num)[0]++;
                map.get(num)[2]=i;
            }else {
                map.put(num,new int[]{1,i,i});
            }
        }
        int max=0,res=Integer.MAX_VALUE;
        for(Map.Entry<Integer,int[]> entry:map.entrySet()){
            int[] temp=entry.getValue();
            if(temp[0]>max){
                max=temp[0];
                res=temp[2]-temp[1]+1;
            }else if(temp[0]==max){
                res=Math.min(res,temp[2]-temp[1]+1);
            }
        }
        return res;
    }
}
