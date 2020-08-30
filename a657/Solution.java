package a657;

/**
 * @author: chenyu
 * @date: 2020/8/30 15:13
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int[] temp={0,0,0,0};
        for(int i=0;i<moves.length();i++){
            char s=moves.charAt(i);
            if(s=='U'){
                temp[0]++;
            }else if(s=='D'){
                temp[1]++;
            }else if(s=='R'){
                temp[2]++;
            }else if(s=='L'){
                temp[3]++;
            }
        }
        return temp[0]==temp[1]&&temp[2]==temp[3];
    }
}
