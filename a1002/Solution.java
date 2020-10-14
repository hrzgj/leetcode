package a1002;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/10/14 9:22
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list=new LinkedList<>();
       int[] size=new int[26];
        Arrays.fill(size,Integer.MAX_VALUE);
        for (String value : A) {
            int[] temp = new int[26];
            for (int j = 0; j < value.length(); j++) {
                char s = value.charAt(j);
                temp[s - 'a']++;
            }
            for (int j = 0; j < size.length; j++) {
                size[j] = Math.min(size[j], temp[j]);
            }
        }
        for(int i=0;i<size.length;i++){
            if(size[i]!=Integer.MAX_VALUE){
                char s=(char)(i+'a');
                String str= String.valueOf(s);
                for(int j=0;j<size[i];j++){
                    list.add(str);
                }
            }
        }
        return list;
    }
}
