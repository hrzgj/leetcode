package a416;

/**
 * @author: chenyu
 * @date: 2020/9/12 16:08
 */
public class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        if(sum==0){
            return true;
        }
        return back(nums,sum/2,0);
    }

    private boolean back(int[] nums,int target,int j){
        if(j>=nums.length){
            return false;
        }
        if(target==0){
            return  true;
        }
        if(target<0){
            return false;
        }
        boolean b=back(nums,target-nums[j],j+1);
        if(b){
            return true;
        }
        return    back(nums,target,j+1);
    }

    private int test(){
        int a=110;
        try {
            a=a/0;
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
        } finally {
            a = 40;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int a=solution.test();
    }
}
