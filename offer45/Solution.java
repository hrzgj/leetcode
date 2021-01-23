package offer45;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/1/23 12:07
 */
public class Solution {
    public String minNumber(int[] nums) {
        String[] num=new String[nums.length];
        for(int i=0;i<num.length;i++){
            num[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(num,(x,y)->((x+y).compareTo(y+x)));
        StringBuilder stringBuilder=new StringBuilder();
        for(String s:num){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
