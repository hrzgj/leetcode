package a125;

/**
 * @author: chenyu
 * @date: 2020/6/19 9:22
 */
public class Solution {
    public boolean isPalindrome(String s) {
        char[] str=s.toCharArray();
        int first=0,second=str.length-1;
        while (first<second){
            while (first<second&&!Character.isLetterOrDigit(str[first])){
                first++;
            }
            while (first<second&&!Character.isLetterOrDigit(str[second])){
                second--;
            }
            if(Character.toLowerCase(str[first])!=Character.toLowerCase(str[second])){
                return false;
            }else {
                ++first;
                --second;
            }
        }
        return true;
    }
}
