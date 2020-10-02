package a771;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.regex.Pattern;

/**
 * @author: chenyu
 * @date: 2020/10/2 10:04
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> characters=new HashSet<>();
        for(int i=0;i<J.length();i++){
            characters.add(J.charAt(i));
        }
        int reuslt=0;
        for(int i=0;i< S.length();i++){
            if(characters.contains(S.charAt(i))){
                reuslt++;
            }
        }
        return reuslt;
    }
}
