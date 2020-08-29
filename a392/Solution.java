package a392;

/**
 * @author: chenyu
 * @date: 2020/7/27 10:45
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
        int m=s.length();
        int j=0;
        for(int i=0;i<n&&j<m;i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        return j == m ;
    }
}
