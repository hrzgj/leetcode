package a696;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/8/10 10:21
 */
public class Solution {
    public int countBinarySubstrings(String s) {
        int last=0,result=0;
        int n=0;
        while (n<s.length()){
            char c=s.charAt(n);
            int count=0;
            while (n<s.length()&&s.charAt(n)==c){
                count++;
                n++;
            }
            result+=Math.min(count,last);
            last=count;
        }
        return result;
    }
}
