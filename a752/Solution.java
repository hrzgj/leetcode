package a752;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/10/28 12:04
 */
public class Solution {
    private String up(String data,int i){
        char[] chars=data.toCharArray();
        if(chars[i]=='9'){
            chars[i]='0';
        }else {
            chars[i]+=1;
        }
        return new String(chars);
    }

    private String down(String data,int i){
        char[] chars=data.toCharArray();
        if(chars[i]=='0'){
            chars[i]='9';
        }else {
            chars[i]-=1;
        }
        return new String(chars);
    }

    public int openLock2(String[] deadends, String target) {
        HashSet<String> visit=new HashSet<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(deadends));
        if(set.contains(target)||set.contains("0000")){
            return -1;
        }
        visit.add("0000");
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("0000");
        int index=0;
        while (!linkedList.isEmpty()){
            int size=linkedList.size();
            index++;
            while (size-->0){
                String s=linkedList.pop();
                if(set.contains(s)){
                    continue;
                }
                if(s.equals(target)){
                    return index;
                }
                for(int i=0;i<4;i++){
                    String up=up(s,i);
                    String down=down(s,i);
                    if(!visit.contains(up)){
                        visit.add(up);
                        linkedList.add(up);
                    }
                    if(!visit.contains(down)){
                        visit.add(down);
                        linkedList.add(down);
                    }
                }
            }

        }
        return -1;
    }
}
