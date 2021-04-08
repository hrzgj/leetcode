package interview0106;

/**
 * @author: chenyu
 * @date: 2021/4/8 9:21
 */
public class Solution {
    public String compressString(String S) {
        StringBuilder stringBuilder=new StringBuilder();
        int left=0,right=0;
        while (right<S.length()){
            char c=S.charAt(left);
            while (right<S.length() && S.charAt(right)==c){
                right++;
            }
            stringBuilder.append(c).append(right-left);
            left=right;
        }
        return stringBuilder.length()>=S.length()?S:stringBuilder.toString();
    }
}
