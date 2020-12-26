package a151;

/**
 * @author: chenyu
 * @date: 2020/12/26 10:17
 */
public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int i=s.length()-1,j=s.length();
        StringBuilder stringBuilder=new StringBuilder();
        while (i>=0){
            while (i>0&&s.charAt(i-1)!=' ')i--;
            stringBuilder.append(s, i, j).append(' ');
            i--;
            while (i>=0&&s.charAt(i)==' ')i--;
            j=i+1;
        }
        return stringBuilder.toString().trim();

    }
}
