package a395;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/2/27 13:23
 */
public class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int res=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()<k){
                for(String string:s.split(String.valueOf(entry.getKey()))){
                    res=Math.max(res,longestSubstring(string,k));
                }
                return res;
            }
        }
        return s.length();
    }
}
