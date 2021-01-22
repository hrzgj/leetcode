package offer39;

/**
 * @author: chenyu
 * @date: 2021/1/22 9:53
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int res = 0;
        for(int num:nums){
            if(count==0){
                res=num;
            }
            count+=(res==num)?1:-1;
        }
        return res;
    }
}
