package interview0105;

/**
 * @author: chenyu
 * @date: 2020/10/29 21:31
 */
public class Solution {
    public boolean oneEditAway(String first, String second) {
        if(Math.abs(first.length()-second.length())>1){
            return false;
        }
        int m=first.length(),n= second.length();
        int i=0,j=0;
        boolean type=true;
        while (i< m&&j< n){
            if(first.charAt(i)==second.charAt(j)){
                i++;
                j++;
            }else {
                if(type){
                    type=false;
                    if(m>n){
                        i++;
                        j++;
                    }else if(m==n){
                        i++;
                        j++;
                    }else {
                        j++;
                    }
                }else {
                    return false;
                }

            }
        }
        return i == m && j == n;
    }
}
