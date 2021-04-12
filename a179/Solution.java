package a179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2021/4/12 9:05
 */
public class Solution {
    public String largestNumber(int[] nums) {
        Integer[] res=new Integer[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            res[i]=nums[i];
        }
        Arrays.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                StringBuilder sb1=new StringBuilder().append(o1).append(o2);
                StringBuilder sb2=new StringBuilder().append(o2).append(o1);
                return sb1.toString().compareTo(sb2.toString());
            }
        });
        if (res[0] == 0) {
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for (Integer re : res) {
            sb.append(re);
        }
        return sb.toString();
    }

    public void quick(int[] nums,int left,int right){
        if(left<right){
            int mid=findIndex(nums,left,right);
            quick(nums,left,mid-1);
            quick(nums,mid+1,right);
        }
    }

    private int findIndex(int[] nums,int left,int right){
        int num=nums[left];
        int i=left+1,j=right;
        while (true){
            while (i!=right && nums[i]<num){
                i++;
            }
            while (j!=left && nums[j]>num){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(nums,i,j);
        }
        swap(nums,left,j);
        return j;
    }

    private void swap(int[] nums,int left,int right) {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
