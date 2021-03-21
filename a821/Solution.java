package a821;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: chenyu
 * @date: 2021/3/21 9:43
 */
public class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res=new int[s.length()];
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                list.add(i);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(list.size()>1&&i>list.get(1)){
                list.removeFirst();
            }
            res[i]=Math.min(Math.abs(i-list.get(0)),Math.abs(i-list.get(0)));
        }
        return res;
    }
}
