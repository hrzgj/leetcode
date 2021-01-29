package offer58;

/**
 * @author: chenyu
 * @date: 2021/1/28 9:42
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        String pre=s.substring(0,n);
        String later=s.substring(n);
        return later+pre;
    }

    public String reverseWords(String s) {
        s=s.trim();
        char[] ch=s.toCharArray();
        int i=ch.length-1;
        StringBuilder stringBuilder=new StringBuilder();
        while (i>=0){
            while (ch[i]==' ') i--;
            StringBuilder builder=new StringBuilder();
            while (ch[i]!=' ') {
                builder.insert(0,ch[i]);
                i--;
            }
            stringBuilder.append(builder).append(' ');

        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
}
