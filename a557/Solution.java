package a557;

/**
 * @author: chenyu
 * @date: 2020/8/30 12:48
 */
public class Solution {
    public String reverseWords(String s) {
        StringBuilder builder=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                builder.append(new StringBuilder(s.substring(j,i)).reverse());
                builder.append(' ');
                j=i+1;
            }
        }
        builder.append(new StringBuilder(s.substring(j)).reverse());
        return builder.toString();
    }
}
