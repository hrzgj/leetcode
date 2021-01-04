package a3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/8/10 22:57
 */
class Solution {
    public int lengthOfLongestSubstring2(String s) {
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

    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=0){
            return 0;
        }
        int res=0,left=0;
        HashMap<Character,Integer> map=new HashMap<>();
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
