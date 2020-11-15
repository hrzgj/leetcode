package a5602;

/**
 * @author: chenyu
 * @date: 2020/11/15 10:42
 */
public class Solution {
    public int minOperations(int[] nums, int x) {
        int length=nums.length;
        int[] left=new int[length+1];
        int leftIndex=0;
        left[0]=x;
        for(int i=1;i<length;i++){
            if(left[i-1]-nums[i-1]<0){
                break;
            }
            leftIndex=i;
            left[i]=left[i-1]-nums[i-1];
        }
        int rightIndex=0;
        int[] right=new int[length+1];
        right[0]=x;
        for(int i=1;i<length;i++){
            if(right[i-1]-nums[length-i]<0){
                break;
            }
            rightIndex=i;
            right[i]=right[i-1]-nums[length-i];
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<=leftIndex;i++){
            if(left[i]==0){
                result=Math.min(result,i);
            }
            for(int j=0;j<=rightIndex;j++){
                if(right[j]==0){
                    result=Math.min(result,j);
                }
                if(i==0&&j==0){
                    continue;
                }
                if(left[i]+right[j]==x){
                    result=Math.min(result,i+j);
                }
            }
        }
        return result==Integer.MAX_VALUE?-1:result;

    }

}
