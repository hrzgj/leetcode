package interview0101;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: chenyu
 * @date: 2021/4/7 14:50
 */
public class Solution {
    public boolean isUnique(String astr) {
        char[] ch=astr.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<astr.length()-1;i++){
            if(ch[i]==ch[i+1]){
                return false;
            }
        }
        return true;
    }
}
