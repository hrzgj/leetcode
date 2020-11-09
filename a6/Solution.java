package a6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/11/9 18:17
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=0){
            return "";
        }
        List<StringBuilder> list=new ArrayList<>();
        int length=Math.min(numRows,s.length());
        for(int i=0;i<length;i++){
            list.add(new StringBuilder());
        }
        char[] schar=s.toCharArray();
        boolean add=false;
        int index=0;
        for(char c:schar){
            list.get(index).append(c);
            if(index==0|index==length-1){
                add=!add;
            }
            index+=add?1:-1;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for(StringBuilder a:list){
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }
}
