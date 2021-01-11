package a76;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import static java.util.Map.*;

/**
 * @author: chenyu
 * @date: 2020/12/4 10:38
 */
public class Solution {
//    Map<Character, Integer> ori = new HashMap<Character, Integer>();
//    Map<Character, Integer> cnt = new HashMap<Character, Integer>();
//
//    public String minWindow(String s, String t) {
//        int tLen = t.length();
//        for (int i = 0; i < tLen; i++) {
//            char c = t.charAt(i);
//            ori.put(c, ori.getOrDefault(c, 0) + 1);
//        }
//        int l = 0, r = -1;
//        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
//        int sLen = s.length();
//        while (r < sLen) {
//            ++r;
//            if (r < sLen && ori.containsKey(s.charAt(r))) {
//                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
//            }
//            while (check() && l <= r) {
//                if (r - l + 1 < len) {
//                    len = r - l + 1;
//                    ansL = l;
//                    ansR = l + len;
//                }
//                if (ori.containsKey(s.charAt(l))) {
//                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
//                }
//                ++l;
//            }
//        }
//        return ansL == -1 ? "" : s.substring(ansL, ansR);
//    }
//
//    public boolean check() {
//        Iterator iter = ori.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry entry = (Map.Entry) iter.next();
//            Character key = (Character) entry.getKey();
//            Integer val = (Integer) entry.getValue();
//            if (cnt.getOrDefault(key, 0) < val) {
//                return false;
//            }
//        }
//        return true;
//    }
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int start=0,len=Integer.MAX_VALUE;
        int left=0,right=0;
        char[] ch=s.toCharArray();
        while (right<s.length()){
            have.put(ch[right],have.getOrDefault(ch[right],0)+1);
            while (left<right&&check(need,have)){
                if(right-left+1<len) {
                    len =right - left + 1;
                    start=left;
                }
                have.put(ch[left],have.getOrDefault(ch[left],0)-1);
                left++;
            }
            right++;
        }
        if(len==Integer.MAX_VALUE){
            return "";
        }
        return new StringBuilder(s).substring(start,start+len);
    }
    private boolean check(HashMap<Character,Integer> need,HashMap<Character,Integer> have){
        for (Map.Entry<Character, Integer> next : need.entrySet()) {
            char key =next.getKey();
            int value =next.getValue();
            if (have.getOrDefault(key, 0)<value) {
                return false;
            }
        }
        return true;
    }
}
