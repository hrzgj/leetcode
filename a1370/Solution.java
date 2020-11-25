package a1370;

/**
 * @author: chenyu
 * @date: 2020/11/25 9:17
 */
public class Solution {
    public String sortString(String s) {
        int[] num=new int[26];
        for(char c:s.toCharArray()){
            num[c-'a']++;
        }
        StringBuilder stringBuffer=new StringBuilder();
        for(int i=0;i<s.length();) {
            for(int j=0;j<26;j++){
                if(num[j]>0){
                    stringBuffer.append((char)(j+'a'));
                    num[j]--;
                    i++;
                }
            }
            for(int j=25;j>=0;j--){
                if(num[j]>0){
                    stringBuffer.append((char)(j+'a'));
                    num[j]--;
                    i++;
                }
            }
        }
        return stringBuffer.toString();
    }



}
