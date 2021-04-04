package a781;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chenyu
 * @date: 2021/4/4 8:32
 */
public class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int y : answers) {
            count.put(y, count.getOrDefault(y, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int y = entry.getKey(), x = entry.getValue();
            ans += (x + y) / (  y + 1) * (y + 1);
        }
        return ans;
    }
    public int numRabbits2(int[] answers) {
        // 存储每个数量的最大剩余可配对数
        int[] st = new int[1000];
        int res = 0;
        // 枚举所有回答
        for(int i : answers) {
            if(st[i] > 0) {
                // 如果还有剩余的可配数，那么就直接用掉
                st[i] --;
            } else {
                // 如果没有该数量的相同颜色，那么就设置初始配对数
                st[i] = i;
                // 同时兔子的数量就要加上这么多
                // 为什么是i+1，因为兔子增量就是当前这只兔子和相同颜色的兔子数量
                res += i + 1;
            }
        }

        return res;
    }
}
