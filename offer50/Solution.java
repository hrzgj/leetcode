package offer50;

/**
 * @author: chenyu
 * @date: 2021/1/25 9:20
 */
public class Solution {
    public char firstUniqChar(String s) {
        char[] c=s.toCharArray();
        int[] num=new int[26];
        for(char ch:c){
            num[ch-'a']++;
        }
        for(char ch:c){
            if(num[ch-'a']==1){
                return ch;
            }
        }
        return ' ';
    }
}
