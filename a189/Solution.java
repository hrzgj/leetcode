package a189;

/**
 * @author: chenyu
 * @date: 2021/1/8 9:09
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int count=gcd(k,n);
        for(int i=0;i<count;i++){
            int j=(i+k)%n;
            int current=nums[i];
            while (j!=i){
                int temp=nums[j];
                nums[j]=current;
                current=temp;
                j=(j+k)%n;
            }
            nums[i]=current;
        }

//        int n=nums.length;
//        k%=n;
//        reverse(nums,0,n-1);
//        reverse(nums,0,k-1);
//        reverse(nums,k,n-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public int gcd(int x, int y) {
        return y>0?gcd(y,x%y):x;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.rotate(new int[]{1,2,3,4,5,6,7,8,9},3);
    }

}
