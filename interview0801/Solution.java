package interview0801;

/**
 * @author: chenyu
 * @date: 2020/9/1 20:19
 */
public class Solution {
    public int waysToStep(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        else if(n==3){
            return 4;
        }
        int i=1,j=2,k=4;
        for(int l=4;l<=n;l++){
            int temp=(k+j)%1000000007;
            temp=(temp+i)%1000000007;
            i=j;
            j=k;
            k=temp;

        }
        return k;

    }
}
