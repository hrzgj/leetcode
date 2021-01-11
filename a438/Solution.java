package a438;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/1/11 17:06
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res=new LinkedList<>();
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(char c:p.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left=0,right=0;
        char[] ch=s.toCharArray();
        while (right<s.length()){
            have.put(ch[right],have.getOrDefault(ch[right],0)+1);
            while (right-left+1>=p.length()){
                if(check(need,have)){
                    res.add(left);
                }
                have.put(ch[left],have.getOrDefault(ch[left],0)-1);
                left++;
            }
            right++;
        }
        return res;
    }
    private boolean check(HashMap<Character,Integer> need,HashMap<Character,Integer> have){
        for (Map.Entry<Character, Integer> next : have.entrySet()) {
            char key =next.getKey();
            int value =next.getValue();
            if (need.getOrDefault(key, 0)!=value) {
                return false;
            }
        }
        return true;
    }
}
