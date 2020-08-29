package a20;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/8/14 10:49
 */
public class Solution {
    public boolean isValid(String s) {
        if("".equals(s)){
            return true;
        }
        LinkedList<Character> linkedList=new LinkedList<Character>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp=='('||temp=='['||temp=='{'){
                linkedList.push(temp);
                continue;
            }else {
                if(linkedList.isEmpty()){
                    return false;
                }else {
                    Character left = linkedList.pop();
                    if(temp==')'&&left=='('){
                        continue;
                    }else if(temp==']'&&left=='['){
                        continue;
                    }else if(temp=='}'&&left=='{'){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }
        return linkedList.isEmpty();
    }
}
