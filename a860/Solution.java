package a860;

/**
 * @author: chenyu
 * @date: 2020/12/10 9:23
 */
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] res=new int[2];
        for(int bill:bills){
            if(bill==5){
                res[0]++;
            }else if(bill==10){
                res[1]++;
                if(res[0]<=0){
                    return false;
                }
                res[0]--;
            }else {
                if(res[0]>=3){
                    res[0]-=3;
                }else if(res[0]>=1&&res[1]>=1){
                    res[0]--;
                    res[1]--;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
