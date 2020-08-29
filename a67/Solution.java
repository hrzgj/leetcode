package a67;

/**
 * @author: chenyu
 * @date: 2020/6/23 9:27
 */
public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder builder=new StringBuilder();
        int n=Math.max(a.length(),b.length()),carry=0;
        for(int i=0;i<n;i++){
            if(i<a.length()){
                carry+=a.charAt(a.length()-i-1)-'0';
            }
            if(i<b.length()){
                carry+=b.charAt(b.length()-i-1)-'0';
            }
            builder.append(carry%2);
            carry/=2;
        }
        if(carry>0){
            builder.append('1');
        }
        return builder.reverse().toString();
    }
}
