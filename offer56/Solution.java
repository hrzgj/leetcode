package offer56;

/**
 * @author: chenyu
 * @date: 2021/1/29 9:16
 */
public class Solution {
    public int[] singleNumbers(int[] nums) {
        int res=0;
        for(int num:nums){
            res^=num;
        }
        int div=1;
        while ( (div&res) ==0 ){
            div*=2;
        }
        int a=0,b=0;
        for(int num:nums){
            if((num & div) ==0){
                a^=num;
            }else {
                b^=num;
            }
        }
        return new int[]{a,b};
    }
}
