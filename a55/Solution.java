package a55;

/**
 * @author: chenyu
 * @date: 2020/10/14 10:53
 */
public class Solution {
    public boolean canJump(int[] nums) {
        boolean[] booleans=new boolean[nums.length];
        booleans[0]=true;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(booleans[i]){
                for(int j=i;j<=i+num;j++){
                    if(j>=nums.length){
                        break;
                    }
                    booleans[j]=true;
                }
            }
        }
        return booleans[nums.length-1];
    }

}
