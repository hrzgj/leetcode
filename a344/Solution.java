package a344;

/**
 * @author: chenyu
 * @date: 2020/10/8 10:36
 */
public class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while (left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
