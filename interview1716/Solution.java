package interview1716;

/**
 * @author: chenyu
 * @date: 2020/8/31 13:08
 */
public class Solution {
    public int massage(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<i-1;j++){
                temp=Math.max(result[j],temp);
            }
            result[i]+=nums[i]+temp;
        }
        return Math.max(result[nums.length-1],result[nums.length-2]);
    }

    public int massage2(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] result=new int[nums.length];
        result[0]=nums[0];
        result[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            result[i]=Math.max(result[i-1],result[i-2]+nums[i]);
        }
        return result[nums.length-1];
    }
}
