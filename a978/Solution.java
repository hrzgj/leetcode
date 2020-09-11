package a978;

/**
 * @author: chenyu
 * @date: 2020/9/11 11:00
 */
public class Solution {
    public int maxTurbulenceSize(int[] A) {
        if(A.length<=0){
            return 0;
        }
        int n= A.length;
        int[] dp=new int[n];
        if(n==1){
            return 1;
        }
        int flag=A[1]-A[0];
        dp[0]=1;
        dp[1]=flag==0?1:2;
        int f;
        int reuslt=dp[1];
        for(int i=2;i<n;i++){
            int k=A[i]-A[i-1];
            if(k==0){
                f=0;
            }else if(k>0){
                f=1;
            }else {
                f=-1;
            }
            if(f*flag<0){
                dp[i]=dp[i-1]+1;
            }else if(f==0){
                dp[i]=1;
            }else {
                dp[i]=2;
            }
            reuslt=Math.max(dp[i],reuslt);
        }
        return reuslt;

    }



}
