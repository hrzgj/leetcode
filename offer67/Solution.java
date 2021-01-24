package offer67;

/**
 * @author: chenyu
 * @date: 2021/1/24 9:48
 */
public class Solution {
    public int strToInt(String str) {
        char[] c=str.toCharArray();
        int i=0;
        boolean fu=false;
        while (i<str.length()&&str.charAt(i)==' '){
            i++;
        }
        if(i==str.length()){
            return 0;
        }
        if(str.charAt(i)=='-'){
            fu=true;
            i++;
        }else if(str.charAt(i)=='+'){
            i++;
        }
        int result=0;
        while (i<str.length()&&Character.isDigit(c[i])){
            int pop=(int)(c[i]-'0');
            if(fu){
                pop*=-1;
            }
            if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&pop>7)){
                return Integer.MAX_VALUE;
            }
            if(result<Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE/10&&pop<-8)){
                return Integer.MIN_VALUE;
            }
            result=result*10+pop;
            i++;
        }
        return result;
    }
}

