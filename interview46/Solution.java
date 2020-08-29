package interview46;

/**
 * @author: chenyu
 * @date: 2020/6/9 9:13
 */
public class Solution {
    public int translateNum(int num) {
        String s=String.valueOf(num);
        int i=0,j=1,sum=0;
        for(int a=1;a<s.length();a++){
            int b=s.charAt(a-1);
            int c=s.charAt(a);
            if(b*10+c>=10&&b*10+c<=25){
                if(a==1){
                    sum=i+j+1;
                }
                else {
                    sum = i + j;
                }
            }else {
                sum=j;
            }
            i=j;
            j=sum;
        }
        return sum;
    }
}
