package a5;

/**
 * @author: chenyu
 * @date: 2020/8/15 20:41
 */
public class Solution {
    public String longestPalindrome2(String s) {
        if(s==null||s.length()<1) {
            return "";
        }
        int begin=0,max=1;
        for(int i=0;i<s.length()-1;i++){
            int lenOne=check(s,i,i);
            int lenTwo=check(s,i,i+1);
            int len=Math.max(lenOne,lenTwo);
            if(len>max){
                max=len;
                begin=i-(len-1)/2;
            }
        }
        return s.substring(begin,begin+max);
    }

    private int check(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public String longestPalindrome(String s) {
        int begin=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            int length1 = find(s, i, i);
            int length2=find(s,i,i+1);
            int length=Math.max(length1,length2);
            if(length>res){
                begin=i-(length+1)/2+1;
                res=length;
            }
        }
        return s.substring(begin,begin+res);
    }

    private int find(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
