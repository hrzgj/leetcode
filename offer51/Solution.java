package offer51;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

/**
 * @author: chenyu
 * @date: 2021/3/17 16:04
 */
public class Solution {
    int res=0;
    public int reversePairs(int[] nums) {
        mergerSort(nums,0, nums.length-1);
        return res;
    }

    private void mergerSort(int[] nums,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergerSort(nums,left,mid);
            mergerSort(nums,mid+1,right);
            merge(nums,mid,left,right);
        }
    }

    private void merge(int[] nums,int mid,int left,int right){
        int[] temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while (i<=mid&&j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else {
                temp[k++]=nums[j++];
                res+=mid-i+1;
            }
        }
        while (i<=mid){
            temp[k++]=nums[i++];
        }
        while (j<=right){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.length;x++){
            nums[x+left]=temp[x];
        }
    }
}
