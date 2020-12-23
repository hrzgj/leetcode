package a387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/12/23 9:14
 */
public class Solution {

    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(map.containsKey(c[i])){
                c[map.get(c[i])]=' ';
                c[i]=' ';
            }else {
                map.put(c[i],i);
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=' '){
                return i;
            }
        }
        return -1;
    }
}
