package a5605;

/**
 * @author: chenyu
 * @date: 2020/11/22 10:50
 */
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer s=new StringBuffer();
        for(String word:word1){
            s.append(word);
        }
        StringBuffer s2=new StringBuffer();
        for(String word:word2){
            s2.append(word);
        }
        return s.toString().equals(s2.toString());
    }
}
