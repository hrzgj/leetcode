package a1047;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2021/3/9 10:57
 */
public class Solution {
    public String removeDuplicates(String S) {
        LinkedList<Character> linkedList=new LinkedList<>();
        char[] s=S.toCharArray();
        for(int i=0;i<s.length;i++){
            if(!linkedList.isEmpty() && linkedList.peek()==s[i]){
                linkedList.pop();
            }else {
                linkedList.push(s[i]);
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!linkedList.isEmpty()){
            stringBuilder.append(linkedList.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
