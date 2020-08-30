package a214;

import sun.applet.Main;

/**
 * @author: chenyu
 * @date: 2020/8/29 21:21
 */
public class Solution {
    public String shortestPalindrome(String s) {
        String ss = s + new StringBuilder(s).reverse().toString();
        for (int i=s.length(),j=i; i>0; i--,j++) {
            if (ss.substring(0, i).equals(ss.substring(j))) {
                return new StringBuilder(s.substring(i)).reverse().append(s).toString();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.shortestPalindrome("abcd");
    }
}
