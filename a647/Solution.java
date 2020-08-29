package a647;

/**
 * @author: chenyu
 * @date: 2020/8/19 10:56
 */
public class Solution {
    public int countSubstrings(String s) {
       int result=0;
       for(int i=0;i<s.length();i++){
           result++;
           int left=i-1,right=i+1;
           while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
               result++;
               left--;
               right++;
           }
       }
       for(int i=0;i<s.length()-1;i++){
           int left=i,right=i+1;
           while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
               result++;
               left--;
               right++;
           }
       }
       return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        String a="aaa";
        s.countSubstrings(a);
    }
}

