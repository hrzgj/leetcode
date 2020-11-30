package a58;

/**
 * @author: chenyu
 * @date: 2020/11/30 11:53
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int length=s.length();
        int result=0;
        int i=length-1;
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        for(;i>=0;i--){
            if(s.charAt(i)!=' '){
                result++;
            }else{
                break;
            }
        }
        return result;
    }
}
