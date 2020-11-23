package a5608;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenyu
 * @date: 2020/11/22 11:45
 */
public class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int max=tasks[0][1];
        int surplus=max;
        for (int[] task : tasks) {
            if (surplus < task[1]) {
                int add = task[1] - surplus;
                surplus = task[1];
                max += add;
            }
            surplus = surplus - task[0];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.minimumEffort(new int[][]{
                {1,2},{2,4},{4,8}
        });
    }
}
