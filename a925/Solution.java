package a925;

/**
 * @author: chenyu
 * @date: 2020/10/21 9:22
 */
public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        while (j<typed.length()){
            if(i<name.length()&&name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else {
                break;
            }
        }
        return i == name.length();

    }

}
