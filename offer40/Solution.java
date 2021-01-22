package offer40;

import java.util.Arrays;

/**
 * @author: chenyu
 * @date: 2021/1/22 9:55
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quick(arr,0,arr.length-1,k-1);
    }

    private int[] quick(int[] arr,int left,int right,int k){
        int index=partition(arr,left,right);
        if(index==k){
            return Arrays.copyOf(arr,index+1);
        }
        return index>k?quick(arr,left,index-1,k):quick(arr,index+1,right,k);
    }

    private int partition(int[] arr,int left,int right){
        int i=left;
        int j=right+1;
        while (true){
            while (++i<=right&&arr[i]<arr[left]) ;
            while (--j>=left&&arr[j]>arr[left]) ;
            if(i>=j){
                break;
            }
            swap(arr,i,j);
        }
        swap(arr,left,j);
        return j;
    }

    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.getLeastNumbers(new int[]{0,0,1,2,4,2,2,3,1,4}, 8);
    }
}
