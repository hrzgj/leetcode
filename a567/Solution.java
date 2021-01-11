package a567;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/1/11 16:32
 */
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(char c:s1.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left=0,right=0;
        char[] ch=s1.toCharArray();
        while (right<s2.length()){
            have.put(ch[right],have.getOrDefault(ch[right],0)+1);
            while (right-left>=s1.length()) {
                if(check(need,have)) {
                    return true;
                }else {
                    have.put(ch[left],have.getOrDefault(ch[left],0)-1);
                }
                left++;
            }
            right++;
        }
        return false;
    }

    private boolean check(HashMap<Character,Integer> need,HashMap<Character,Integer> have){
        for (Map.Entry<Character, Integer> next : have.entrySet()) {
            char key =next.getKey();
            int value =next.getValue();
            if (need.getOrDefault(key, 0) !=value) {
                return false;
            }
        }
        return true;
    }
}
