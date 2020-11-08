package a327;

/**
 * @author: chenyu
 * @date: 2020/11/7 9:31
 */
public class Solution {
    public static final int INTEGER_CONSTANT2 = 100;

    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sum=new long[nums.length+1];
        int result=0;
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]+=sum[i-1]+nums[i];
            if(sum[i]>=lower&&sum[i]<=upper){
                result++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if (nums[i] >= lower && nums[i] <= upper) {
                result++;
            }
            if(i==0){
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                long sums=sum[j]-sum[i-1];
                if(sums>=lower&&sums<=upper){
                    result++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.countRangeSum(new int[]{-2,5,-1},-2,2);
    }
}
