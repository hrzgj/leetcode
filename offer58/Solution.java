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
}
