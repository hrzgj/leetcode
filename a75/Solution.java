package a75;

/**
 * @author: chenyu
 * @date: 2020/10/7 10:32
 */
public class Solution {
    public void sortColors(int[] nums) {
        int red=0,white=0,blue=0;
        for(int num:nums){
            if(num==0){
                red++;
            }else if(num==1){
                white++;
            }else {
                blue++;
            }
        }
        int index=0;
        while (red-->0){
            nums[index++]=0;
        }
        while (white-->0){
            nums[index++]=0;
        }
        while (blue-->0){
            nums[index++]=0;
        }
    }
}
