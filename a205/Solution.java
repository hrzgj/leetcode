package a205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: chenyu
 * @date: 2020/12/27 9:43
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)!=t.charAt(i)){
                    return false;
                }
            }else {
                if(set.contains(t.charAt(i))){
                    return false;
                }
                set.add(t.charAt(i));
                map.put(c,t.charAt(i));
            }
        }
        return true;
    }
}
