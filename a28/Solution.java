package a28;

/**
 * @author: chenyu
 * @date: 2020/11/13 11:56
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int hayLength=haystack.length();
        int needLength=needle.length();
        if(needLength<=0){
            return 0;
        }

        for(int i=0;i<hayLength-needLength;i++){
            for(int j=0;j<needLength;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==needLength-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
