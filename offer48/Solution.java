package offer48;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/1/24 9:56
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}
