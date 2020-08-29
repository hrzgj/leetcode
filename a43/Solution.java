package a43;

/**
 * @author: chenyu
 * @date: 2020/8/13 9:11
 */
public class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        String result="0";
        int n=num1.length();int m=num2.length();
        for(int i=m-1;i>=0;i--){
            StringBuilder stringBuilder=new StringBuilder();
            for(int j=m-1;j>i;j--){
                stringBuilder.append('0');
            }
            int add=0;
            int two=num2.charAt(i)-'0';
            for(int j=n-1;j>=0;j--){
                int first=num1.charAt(j)-'0';
                int sum=first*two+add;
                stringBuilder.append(sum%10);
                add=sum/10;
            }
            if(add!=0){
                stringBuilder.append(add%10);
            }
            String sum=stringBuilder.reverse().toString();
            StringBuilder builder=new StringBuilder();
            int resultL=result.length()-1,sumL=sum.length()-1,ans=0;
            while (resultL>=0||sumL>=0||ans!=0){
                int x=resultL>=0?result.charAt(resultL)-'0':0;
                int y=sumL>=0?sum.charAt(sumL)-'0':0;
                int temp=x+y+add;
                builder.append(temp%10);
                ans=temp/10;
                resultL--;
                sumL--;
            }
            result=builder.reverse().toString();

        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.multiply("123","41");
    }
}
