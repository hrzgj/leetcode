package a974;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2020/5/27 15:19
 */
public class Solution {

    //暴力解法
    public int subarraysDivByK(int[] A, int K) {
        int num=0;
        List<List<Integer>> list=new ArrayList<>();
        for(int i =0;i<A.length;i++){
            List<Integer> integerList=new ArrayList<>();
            for(int j=i;j<A.length;j++){
                integerList.add(A[j]);
                if(integerList.stream().mapToInt(Integer::intValue).sum()%K==0){
                    num++;
                }
            }
        }
        return num;
    }

    //最好解法
    public int bestSubarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0, ans = 0;
        for (int elem: A) {
            sum += elem;
            // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
            int modulus = (sum % K + K) % K;
            int same = record.getOrDefault(modulus, 0);
            ans += same;
            record.put(modulus, same + 1);
        }
        return ans;
    }
}
