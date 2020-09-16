package a11;

/**
 * @author: chenyu
 * @date: 2020/9/16 10:17
 */
public class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int result=Integer.MIN_VALUE;
        while (left<right){
            int temp=Math.min(height[left],height[right])*(right-left);
            result=Math.max(temp,result);
            if(height[left]>=height[right]){
                    right--;
            }else {
                    left++;
            }
        }
        return result;
    }
}
