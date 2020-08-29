package a415;

/**
 * @author: chenyu
 * @date: 2020/8/3 10:03
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        int n=num1.length()-1;
        int m=num2.length()-1;
        StringBuilder stringBuilder=new StringBuilder();
        int add=0;
        while (n>=0||m>=0||add!=0){
            int x=n>=0?num1.charAt(n)-'0':0;
            int y=m>=0?num2.charAt(m)-'0':0;
            int result=x+y+add;
            stringBuilder.append(result%10);
            add=result/10;
            n--;
            m--;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
