package a659;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/12/4 9:25
 */
public class Solution {
    public boolean isPossible(int[] nums) {
        int n=nums.length;
        if(n<3){
            return false;
        }
        Map<Integer,Integer> remain=new HashMap<>();
        Map<Integer,Integer> column=new HashMap<>();
        for(int num:nums){
            remain.put(num,remain.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            int re=remain.getOrDefault(num,0);
            if(re<=0){
                continue;
            }
            int pre=column.getOrDefault(num-1,0);
            if( pre>0){
                remain.put(num,re-1);
                column.put(num-1,pre-1);
                column.put(num,column.getOrDefault(num,0)+1);
            }else{
                int num1=remain.getOrDefault(num+1,0),num2=remain.getOrDefault(num+2,0);
                if(num1>0&&num2>0){
                    remain.put(num,re-1);
                    remain.put(num1,remain.get(num1)-1);
                    remain.put(num2,remain.get(num2)-1);
                    column.put(num2,column.getOrDefault(num2,0)+1);
                }else{
                    return false;
                }

            }
        }
        return true;
    }

}
