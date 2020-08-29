package a1343;

/**
 * @author: chenyu
 * @date: 2020/8/10 20:32
 */
public class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int[] sums=new int[arr.length];
        sums[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sums[i]+=arr[i]+sums[i-1];
        }
        int result=0;
        if(sums[k-1]/k>threshold){
            result++;
        }
        for(int i=k;i<arr.length;i++){
            int sum=(sums[i]-sums[i-k])/k;
            if(sum>threshold){
                result++;
            }
        }
        return result;
    }
}
