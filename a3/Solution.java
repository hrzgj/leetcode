package a3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/8/10 22:57
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            Map<Character, Integer> map=new HashMap<>();
            while (i<s.length()){
                if(map.containsKey(s.charAt(i))){
                    i=map.get(s.charAt(i));
                    break;
                }
                map.put(s.charAt(i),i);
                i++;
            }
            result=Math.max(result,map.size());
        }
        return result;
    }
}
