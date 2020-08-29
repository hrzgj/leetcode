package offer05;

/**
 * @author: chenyu
 * @date: 2020/8/17 20:49
 */
public class Solution {
    public String replaceSpace(String s) {
        if(s==null||s.length()==0){
            return null;
        }
        return s.replace(" ","%20");
    }
}
