package a5535;

/**
 * @author: chenyu
 * @date: 2020/10/11 10:39
 */
public class Solution {
    public int maxDepth(String s) {
        int result=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                sum++;
            }
            if(s.charAt(i)==')'){
                result=Math.max(result,sum);
                sum--;
            }
        }
        return result;
    }
}
