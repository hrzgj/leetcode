package a389;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/12/18 10:15
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                int num=map.get(c);
                if(num==0){
                    return c;
                }else {
                    map.put(c,num-1);
                }
            }else {
                return c;
            }
        }
        return 'a';
    }
}
