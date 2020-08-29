package a9;

/**
 * @author: chenyu
 * @date: 2020/6/10 8:39
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuffer stringBuffer=new StringBuffer(s);
        StringBuffer stringBuffer1=stringBuffer.reverse();
        String s1=stringBuffer1.toString();
        return s.equals(s1);


    }
}
