package a331;

/**
 * @author: chenyu
 * @date: 2021/3/12 16:27
 */
public class Solution {
    public boolean isValidSerialization(String preorder) {
        char[] c=preorder.toCharArray();
        int n=preorder.length()-1;
        int num=0;
        for(int i=n;i>=0;i--){
            if(c[i]==','){
                continue;
            }
            if(c[i]=='#'){
                num++;
            }else {
                while (i>=0&&Character.isDigit(c[i])){
                    i--;
                }
                if(num>=2){
                    num--;
                }else {
                    return false;
                }
            }
        }
        return num==1;
    }
}
