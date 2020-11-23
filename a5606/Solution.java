package a5606;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/11/22 10:53
 */
public class Solution {
    char[] result;
    int index= 0;
     StringBuffer stringBuffer=new StringBuffer();
    public String getSmallestString(int n, int k) {
        result=new char[n];
        back(k,n);
        return stringBuffer.toString();
    }

    private void back(int k,int n){
        if((stringBuffer.length())>0){
            return;
        }
        if(k==0&&n==0){
            stringBuffer.append(result);
            return;
        }
        if(k>n*26||n==0){
            return;
        }
        for(int i=0;i<26;i++){
            result[index++]=(char)('a'+i);
            back(k-i-1,n-1);
            index--;
        }

    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.getSmallestString(3,27);
    }
}
