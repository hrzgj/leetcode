package a316;

import java.util.*;

/**
 * @author: chenyu
 * @date: 2020/12/20 9:19
 */
public class Solution {
    public String removeDuplicateLetters(String s) {
        int[] nums=new int[26];
        for(char c:s.toCharArray()){
            nums[c-'a']++;
        }
        boolean[] visit=new boolean[26];
        StringBuilder stack=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(visit[c-'a']){
                continue;
            }
            while (stack.length()>0&&nums[stack.charAt(stack.length()-1)-'a']>=1&&stack.charAt(stack.length()-1)>c){
                visit[stack.charAt(stack.length()-1)-'a']=false;
                stack.deleteCharAt(stack.length()-1);
            }
            stack.append(c);
            nums[c-'a']--;
            visit[c-'a']=true;
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.removeDuplicateLetters("cbacdcbc");
    }
}
