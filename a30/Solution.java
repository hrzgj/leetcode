package a30;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/11/13 20:54
 */
public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list=new LinkedList<>();
        Map<String,Integer> map=new HashMap<>();
        int length=words[0].length();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int index=0;
        int num=words.length;
        while (index+length<=s.length()){
            int nums=0;
            Map<String,Integer> hashMap=new HashMap<>();
            int begin=index;
            while (index+length<=s.length()){
                String word=s.substring(index,index+length);
                index+=length;
                if(map.containsKey(word)){
                    Integer tempNum = hashMap.getOrDefault(word,0)+1;
                    if(tempNum>map.get(word)){
                        index=begin+1;
                        break;
                    }
                    hashMap.put(word,tempNum);
                }else {
                    index=begin+1;
                    break;
                }
                nums++;
                if(num==nums){
                    list.add(begin);
                    index=begin+1;
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.findSubstring("barfoofoobarthefoobarman",new String[]{"bar","foo"});
    }
}
