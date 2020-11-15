package a402;

import java.util.LinkedList;

/**
 * @author: chenyu
 * @date: 2020/11/15 9:49
 */
public class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
            return "0";
        }
        StringBuffer stringBuffer=new StringBuffer();
        int index=0;
        while (index<num.length()){
            char c = num.charAt(index);
            while ((stringBuffer.length() > 0) && (k > 0) && (stringBuffer.charAt(stringBuffer.length() - 1) > c)){
                stringBuffer.deleteCharAt(stringBuffer.length()-1);
                k--;
            }
            stringBuffer.append(c);
        }
        while (true){
            if(stringBuffer.length()>0&&stringBuffer.charAt(0)=='0'){
                stringBuffer.deleteCharAt(0);
            }else {
                break;
            }
        }
        while (k-->0){
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
        return stringBuffer.toString();

    }
}
