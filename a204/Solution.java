package a204;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chenyu
 * @date: 2020/12/3 9:28
 */
public class Solution {
    public int countPrimes(int n) {
        boolean[] booleans=new boolean[n];
        List<Integer> size=new LinkedList<>();
        Arrays.fill(booleans,true);
        for(int i=2;i<n;i++){
            if(booleans[i]){
                size.add(i);
            }
            for(int j=0;j<size.size()&&i*size.get(j)<n;j++){
                booleans[i*size.get(j)]=false;
                if(i%size.get(j)==0){
                    break;
                }
            }
        }
        return size.size();
    }
}
