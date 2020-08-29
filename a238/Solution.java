package a238;

/**
 * @author: chenyu
 * @date: 2020/6/4 9:20
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
       int[] left=new int[nums.length];
       int[] right=new int[nums.length];
       int[] result=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           if(i==0){
               left[i]=1;
           }else {
               left[i]=left[i-1]*nums[i-1];
           }
       }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                right[i]=1;
            }else {
                right[i]=right[i+1]*nums[i+1];
            }
        }
        for(int i=0;i<nums.length;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
    //无法处理[1,0]这种情况
    public int[] oldProductExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        long he=1;
        for(int i:nums){
            he*=i;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                result[i]=0;
            }else {
                result[i]= Math.toIntExact(he / nums[i]);
            }
        }
        return result;
    }

}
