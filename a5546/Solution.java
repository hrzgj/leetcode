package a5546;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2020/10/25 10:30
 */
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char a=keysPressed.charAt(0);
        int ans=releaseTimes[0];
        for(int i=1;i<keysPressed.length();i++){
            if(releaseTimes[i]-releaseTimes[i-1]>ans){
                ans=releaseTimes[i]-releaseTimes[i-1];
                a=keysPressed.charAt(i);
            }else if(releaseTimes[i]-releaseTimes[i-1]==ans){
                if(keysPressed.charAt(i)<a){
                    a=keysPressed.charAt(i);
                }
            }
        }
        return a;
    }
}
