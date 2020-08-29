package a17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/8/26 10:00
 */
public class Solution {
    StringBuilder stringBuilder=new StringBuilder();
    List<String> strings=new LinkedList<>();
    Map<Character,String > map;
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()<=0){
            return new LinkedList<>();
        }
        map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        back(digits,0);
        return strings;
    }

    private void back(String digits,int index){
        if(index==digits.length()){
            strings.add(stringBuilder.toString());
            return;
        }
        String num=map.get(digits.charAt(index));
        for(int i=0;i<num.length();i++){
            stringBuilder.append(num.charAt(i));
            back(digits,index+1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }


    }


}
