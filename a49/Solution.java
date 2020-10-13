package a49;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/10/13 15:15
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new LinkedList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String s=String.valueOf(chars);
            if(map.containsKey(s)){
                lists.get(map.get(s)).add(str);
            }else {
                List<String> list=new LinkedList<>();
                list.add(str);
                lists.add(list);
                map.put(s,lists.size()-1);
            }
        }
        return lists;
    }
}
