package a1207;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/10/28 9:49
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry=iterator.next();
            Integer value=  entry.getValue();
            iterator.remove();
            if(map.containsValue(value)){
                return false;
            }

        }
        return true;
    }
}
