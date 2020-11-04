package a140;

import javax.swing.*;
import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/11/1 20:55
 */
public class Solution {
    HashSet<String> hashSet;
    HashMap<Integer,List<String>> map;
    public List<String> wordBreak(String s, List<String> wordDict) {
        hashSet = new HashSet<>(wordDict);
        map=new HashMap<>();
        return dfs(0,s);
    }

    private List<String> dfs(int start,String s){
        if(map.containsKey(start)){
            return map.get(start);
        }
        if(start>=s.length()){
            return new LinkedList<String>(){{add("2");}};
        }
        List<String> result=new LinkedList<>();
        for(int i=start+1;i<=s.length();i++){
            String temp=s.substring(start,i);
            if(hashSet.contains(temp)){
                List<String> list=dfs(i,s);
                for(String a:list){
                    result.add("2".equals(a)?temp:temp+" "+a);
                }
            }
        }
        map.put(start,result);
        return result;
    }

    public static void main(String[] args) {
        List<String> list=new LinkedList<String>(){{add("");}};
        System.out.println(list.size());
        for(String s:list){
            System.out.println(s);
        }
    }
}
