package a5543;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/10/18 10:30
 */
public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int result=-1;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                result=Math.max(result,i-map.get(s.charAt(i))-1);
            }else {
                map.put(s.charAt(i),i);
            }
        }
        return result;
    }
}
