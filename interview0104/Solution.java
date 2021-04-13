package interview0104;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/4/13 8:51
 */
public class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean flag=false;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2!=0){
                if(flag){
                    return false;
                }
                flag=true;
            }
        }
        return true;
    }
}
