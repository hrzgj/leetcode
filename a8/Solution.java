package a8;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author: chenyu
 * @date: 2020/11/9 18:54
 */
public class Solution {
    public int myAtoi(String s) {
        boolean fu=false;
        int i=0;
        while (i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()){
            return 0;
        }
       if(s.charAt(i)=='-'){
            fu=true;
            i++;
        }else if(s.charAt(i)=='+'){
           i++;
       }
       int result=0;
       while (i<s.length()&&Character.isDigit(s.charAt(i))){
           int pop=(int)(s.charAt(i)-'0');
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

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.myAtoi("   -42");
    }
}
