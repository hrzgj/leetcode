package a127;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/11/5 9:41
 */
public class Solution {
    Map<String,List<String>> map=new HashMap<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.size()<=0||!wordList.contains(endWord)){
            return 0;
        }
        wordList.add(beginWord);
        add(wordList);
        HashSet<String> set=new HashSet<String>();
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add(beginWord);
        set.add(beginWord);
        int step=1;
        while (!linkedList.isEmpty()){
            int size=linkedList.size();
            while (size>0) {
                size--;
                String a = linkedList.poll();
                List<String> list = map.get(a);
                if(list==null||list.size()<=0){
                    continue;
                }
                for (String s : list) {
                    if (s.equals(endWord)) {
                        return step + 1;
                    }
                    if (!set.contains(s)) {
                        linkedList.add(s);
                        set.add(s);
                    }
                }
            }
            if(!linkedList.isEmpty()){
                step++;
            }
        }
        return 0;
    }

    private void add(List<String> wordList){
        for(int i=0;i<wordList.size();i++){
            String a=wordList.get(i);
            for(int j=i+1;j<wordList.size();j++){
                String b=wordList.get(j);
                int different=0;
                for(int k=0;k<a.length();k++){
                    if(different>1){
                        break;
                    }
                    if(a.charAt(k)==b.charAt(k)){
                        continue;
                    }else {
                        different++;
                    }
                }
                if(different==1){
                    if(map.containsKey(a)){
                        map.get(a).add(b);
                    }else {
                        map.put(a,new LinkedList<String>(){{add(b);}});
                    }
                    if(map.containsKey(b)){
                        map.get(b).add(a);
                    }else {
                        map.put(b,new LinkedList<String>(){{add(a);}});
                    }
                }
            }
        }
    }
}
