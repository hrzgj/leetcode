package a290;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/12/16 9:29
 */
public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strings=s.split(" ");
        if(pattern.length()!=strings.length){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            Character p=pattern.charAt(i);
            if(map.containsKey(p)){
                String s1 = map.get(p);
                if(!strings[i].equals(s1)){
                    return false;
                }
            }else {
                for (Map.Entry<Character, String> next : map.entrySet()) {
                    if (next.getValue().equals(strings[i])) {
                        return false;
                    }
                }
                map.put(p,strings[i]);
            }
        }

        return true;
    }
}
