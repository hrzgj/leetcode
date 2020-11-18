package a134;

/**
 * @author: chenyu
 * @date: 2020/11/18 8:55
 */
public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int i=0;
        while (i<n){
            int tempCost=0,tempGas=0;
            int temp=0;
            while (temp<n){
                int j=(i+temp)%n;
                tempCost+=cost[j];
                tempGas+=gas[j];
                if(tempCost>tempGas){
                    break;
                }
                temp++;
            }
            if(temp==n){
                return i;
            }else {
                i=i+temp+1;
            }
        }
        return -1;
    }


    public int canCompleteCircuit2(int[] gas, int[] cost) {
        if(gas.length==1){
            return gas[0]>cost[0]?0:-1;
        }
        for(int i=0;i<gas.length;i++){
            if(gas[i]<cost[i]){
                continue;
            }
            int tempGas=gas[i]-cost[i];
            int cur=i+1;
            while (i !=cur&&tempGas>0){
                if(cur==gas.length){
                    cur=0;
                }
                tempGas+=gas[cur]-cost[cur];
                cur++;
            }
            if(i==cur&&tempGas>=0){
                return i;
            }
            if(i==0&&cur==gas.length&&tempGas>=0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.canCompleteCircuit(new int[]{5},new int[]{4});
    }
}
